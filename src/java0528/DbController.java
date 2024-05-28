package java0528;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java0527.TestDTO;

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
			cud기능(데이터생성(), conn); // << 
			
			데이터읽기("select * from 명단", conn);
			
			sql = "update 명단 set 역활 = '광대' where 번호 = 1";
			cud기능(sql, conn);
			데이터읽기("select * from 명단", conn);
			
			sql = "delete from 명단 where 번호 = 1";
			cud기능(sql, conn);
			데이터읽기("select * from 명단", conn);
		} else {
			System.out.println("테이블 생성 실패!!");
		}
	}
	
	private String 데이터생성() {
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
		return sql;
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
		System.out.println(sql);
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				DataDto data = new DataDto();
				data.set번호(rs.getInt("번호"));
				data.set이름(rs.getString("이름"));
				data.set성별(rs.getString("성별"));
				data.set특징(rs.getString("특징"));
				data.set해적단(rs.getString("해적단"));
				data.set역활(rs.getString("역활"));
				System.out.println(data);
			}
			rs.close();
			ps.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private void cud기능(String sql, Connection conn) {
		System.out.println(sql);
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			int result = ps.executeUpdate();
			System.out.println(result);
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
