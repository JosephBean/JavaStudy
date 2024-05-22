package java0522;

import java.util.Scanner;

public class Study11 {

	public static void main(String[] args) {
		
		Scanner a = new Scanner(System.in);
		boolean key = false;
		
		
		String[][] 배열1 = new String[3][3];
		String[][] 배열2 = new String[3][3];
		String[][] 배열3 = new String[3][3];
		String[][] 배열4 = new String[3][3];
		
		// 각각 배열에 값넣기 반복문!!
		
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
		
//		if(입력값 == 0) {
//			System.out.println("0을 입력하셨습니다.");
//		}
//		if(입력값 == 1) {
//			System.out.println("1을 입력하셨습니다.");
//		}
//		if(입력값 == 2) {
//			System.out.println("2을 입력하셨습니다.");
//		}
//		if(입력값 == 3) {
//			System.out.println("3을 입력하셨습니다.");
//		}
//		if(입력값 == 4) {
//			System.out.println("4을 입력하셨습니다.");
//		}
		
		
	}

}
