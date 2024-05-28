package java0528;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DbController {
	
	private String 드라이버;
	private String 주소;
	private String 사용자;
	private String 비밀번호;
	
	public DbController(String 드라이버, String 주소, String 사용자, String 비밀번호) {
		this.드라이버 = 드라이버;
		this.주소 = 주소;
		this.사용자 = 사용자;
		this.비밀번호 = 비밀번호;
		시작();
	}
	
	private void 시작() {
		try {
			Class.forName(드라이버);
			Connection conn = DriverManager.getConnection(주소, 사용자, 비밀번호);
			기능제어(conn);
			conn.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	private void 기능제어(Connection conn) {
		System.out.println("테이블 생할 합니다.");
		String sql = "create OR REPLACE table 명단 (";
		sql += " 번호 	int,";
		sql += " 이름 	varchar(50),";
		sql += " 성별 	varchar(50),";
		sql += " 특징 	varchar(50),";
		sql += " 해적단 	varchar(50),";
		sql += " 역활		varchar(50)";
		sql += " )";
		if(테이블생성(sql, conn)) {
			// DML >> CRUD
			// 1단계 데이터 넣기 (insert)
			데이터생성();
		} else {
			System.out.println("테이블 생성 실패!!");
		}
	}
	
	private void 데이터생성() {
		DataDto data = new DataDto();
		data.set번호(1);
		data.set이름("몽키 D 루피");
		data.set성별("남자");
		data.set특징("고무고무 열매");
		data.set해적단("밀짚모자");
		data.set역활("선장");
		
		String sql = "insert into 명단 value (";
		
		sql += data.get번호();
		sql += ",'" + data.get이름() + "'";
		sql += ",'" + data.get성별() + "'";
		sql += ",'" + data.get특징() + "'";
		sql += ",'" + data.get해적단() + "'";
		sql += ",'" + data.get역활() + "'";
		
		sql += ")";
		
		System.out.println(sql);
		
	}
	
	private boolean 테이블생성(String sql, Connection conn) {
		System.out.println(sql);
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.execute();
			ps.close();
			return true;  // << 성공
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;  // << 실패
	}
	
	private void 데이터읽기(String sql, Connection conn) {
		
	}
	
	private void cud기능(String sql, Connection conn) {
		
	}

}
