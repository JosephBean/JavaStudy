package java0522;

public class Study07 {

  public static void main(String[] args) {

		/***********************************************
		 * 문제7) 2차원 배열를 이용하여 별(★)를 출력하시오
		 * 출력 예시)
	     * ★★★★★
	     * ★★★★
	     * ★★★
	     * ★★
	     * ★
	     * ★★
	     * ★★★
	     * ★★★★
	     * ★★★★★
		 ************************************************/

		// 해결 코드 작성 시작

	    String 별 = "★";
	
	    /*** 코드 시작 ***/
	    String[][] 배열 = new String[9][5];
	    
	    for(int i = 0; i < 배열.length; i++) {
	    	for(int j = 0; j < 배열[i].length; j++) {
	    		String 빈공간 = " ";
	    		if((i == 1 || i == 7) && j >= 4) {
	    			배열[i][j] = 빈공간;
	    		} else if((i == 2 || i == 6) && j >= 3) {
	    			배열[i][j] = 빈공간;
	    		} else if((i == 3 || i == 5) && j >= 2) {
	    			배열[i][j] = 빈공간;
	    		} else if(i == 4 && j >= 1) {
	    			배열[i][j] = 빈공간;
	    		} else {
	    			배열[i][j] = 별;
	    		}
	    	}
	    }
	    
	    
	    for(int i = 0; i < 배열.length; i++) {
	    	for(int j = 0; j < 배열[i].length; j++) {
	    		System.out.print(배열[i][j]);
	    	}
	    	System.out.println();
	    }
	
	    /*** 코드 종료 ***/

  }

}