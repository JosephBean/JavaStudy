package java0522;

import java.util.Scanner;

public class Study10 {

  public static void main(String[] args) {

		/***********************************************
		 * 문제10) 사용자 입력값을 받아 2차원 ★를 출력하시오.
		 * 단, while문 안에서 출력 코드를 작성할것.
		 * 출력 예시)
	     * 입력 출력
	     * (1) ★★★★★    
	     *     ★★★★
	     *     ★★★
	     *     ★★
	     *     ★
	     *     
	     * (2) ★
	     *     ★★
	     *     ★★★
	     *     ★★★★
	     *     ★★★★★
	     *     
	     * (3)     ★
	     *        ★★
	     *       ★★★
	     *      ★★★★
	     *     ★★★★★
	     *     
	     * (4) ★★★★★
	     *      ★★★★
	     *       ★★★
	     *        ★★
	     *         ★
		 ************************************************/

		// 해결 코드 작성 시작
	    String 별 = "★";
	    Scanner a = new Scanner(System.in);
		boolean key = false;
		
		/*** 배열 값 넣는 코드 시작 ***/
		
		String[][] 배열1 = new String[3][3];
		String[][] 배열2 = new String[3][3];
		String[][] 배열3 = new String[3][3];
		String[][] 배열4 = new String[3][3];
		
		
		
		
		
		/*** 배열 값 넣는 코드 종료 ***/
		
		while(true) {
			System.out.println("1 ~ 4 정수의 값을 입력하세요.");
			int 입력값 = a.nextInt();
			String[][] 배열 = new String[1][1];
			// 출력할 배열 데이터 교체
			if(입력값 == 1) {
				배열 = 배열1;
			} else if(입력값 == 2) {
				배열 = 배열2;
			} else if(입력값 == 3) {
				배열 = 배열3;
			} else if(입력값 == 4) {
				배열 = 배열4;
			}
			// 입력 받은 값에 때라 종료 또는 출력
			switch (입력값) { 
				case 1: 
				case 2: 
				case 3: 
				case 4: 
					 for(int i = 0; i < 배열.length; i++) {
				    	for(int j = 0; j < 배열[i].length; j++) {
				    		System.out.print(배열[i][j]);
				    	}
				    	System.out.println();
				    } 
					break; 
			default:
				System.out.println("잘못된 값입니다."); 
				key = true;
			}
			if(key) break;
		}
	    
  }

}