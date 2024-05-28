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
		테이블생성(sql, conn);
	}
	
	private void 테이블생성(String sql, Connection conn) {
		System.out.println(sql);
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.execute();
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	private void 데이터읽기(String sql, Connection conn) {
		
	}
	
	private void cud기능(String sql, Connection conn) {
		
	}

}
