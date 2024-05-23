package java0523;

import java.util.Scanner;

/*********************************
 * >> Console 입력 알아보기
 * Scanner 클래스의 라이프 사이클
 *********************************/

public class Study01 {

	public static void main(String[] args) {

		/** 객체 생성 **/
		Scanner sc = new Scanner(System.in);
		//System.out.println(sc);
		
		/** 객체 사용 **/
		int a = sc.nextInt();
		System.out.println(a);
		
		
		/** 객체 제거 **/
//		sc.close();
		
//		int b = sc.nextInt();
//		System.out.println(b);
		
		
	}

}
