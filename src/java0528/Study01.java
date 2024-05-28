package java0528;

public class Study01 {

	public static void main(String[] args) {

		String 드라이버 = "org.mariadb.jdbc.Driver";
		String 주소 = "jdbc:mariadb://localhost:3306/edu";
		String 사용자 = "root";
		String 비밀번호 = "1234";
		new DbController(드라이버, 주소, 사용자, 비밀번호);
		
		
		
	}

}
