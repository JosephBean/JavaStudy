package java0524;

public class Study01 {

	public static void main(String[] args) {

		int 값1 = 합(1,2);  	// 1 + 2 = 3
		System.out.println(값1);
		int 값2 = 빼기(1,2);  // 1 - 2 = -1
		System.out.println(값2);
		int 값3 = 나누기(1,2);  // 1 / 2 = 0
		System.out.println(값3);
		int 값4 = 곱하기(1,2);  // 1 * 2 = 2
		System.out.println(값4);
		
	}
	
	private static int 합(int a , int b) {
		return ( a + b );
	}
	
	static int 빼기(int a, int b) {
		return ( a - b );
	}
	
	static int 나누기(int a , int b) {
		return ( a / b );
	}
	
	static int 곱하기(int a, int b) {
		return ( a * b );
	}

}
