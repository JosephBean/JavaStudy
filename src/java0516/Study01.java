package java0516;

public class Study01 {

	public static void main(String[] args) {

		int 숫자 = 1;
		//System.out.println(숫자 + "");
		int 숫자2;
		// System.out.println(숫자2 + "");
/*
		숫자2 = 숫자;
		System.out.println(숫자2 + "");
*/
		
		final int aAbcD = 100;
		//aAbcD = 1;
		
		int 몸무게 = 80;
		float 실수 = 몸무게;
		
		몸무게 = (int) 실수;
		
		int 변수 = 0;
		System.out.println(변수);  // 0
		int a = 변수++;
		System.out.println(변수);  // 1
		System.out.println(a);    // 1
		
		int b = 0;
		
		int c = a + b;
		//		0 + 0  >> 0
		int d = 5;
		d += c;    // 7
	//  5 + 0 >>> 5
		System.out.println(d);  // 5
		
		
	}
}
