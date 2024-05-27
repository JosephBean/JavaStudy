package java0527;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Study01_1 {
	
	String 드라이버 = "org.mariadb.jdbc.Driver";
	String 주소 = "jdbc:mariadb://localhost:3306/edu";
	String 사용자 = "root";
	String 비밀번호 = "1234";

	public void 접속() {
		System.out.println("접속 시작!");
		try {
			Class.forName(드라이버);
			Connection conn = DriverManager.getConnection(주소, 사용자, 비밀번호);
			
			String sql1 = "create OR REPLACE table test (no int, name varchar(50))";
			
			PreparedStatement ps = conn.prepareStatement(sql1);
			ps.execute();
			
			String sql2 = "insert into test (name, no) value ('하이', 1)";
			
			ps = conn.prepareStatement(sql2);
			int result = ps.executeUpdate();
			System.out.println(result);
			
			conn.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
}
