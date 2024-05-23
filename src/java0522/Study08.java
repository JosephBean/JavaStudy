package java0522;

public class Study08 {

  public static void main(String[] args) {

		/***********************************************
		 * 문제8) 2차원 배열를 이용하여 별(★)를 출력하시오
		 * 출력 예시)
	     * ★
	     * ★★
	     * ★★★
	     * ★★★★
	     * ★★★★★
	     * ★★★★
	     * ★★★
	     * ★★
	     * ★
		 ************************************************/

	// 해결 코드 작성 시작

	    String 별 = "★";
	
	    /*** 코드 시작 ***/
	    String[][] arr = new String[9][5];
	    int cnt = arr.length/2;
	    for(int i = 0; i < cnt; i++) {
	    	for(int j = 0; j < arr[i].length; j++) {
	    		if(j > i) {
	    			arr[i][j] = " ";
	    		}else {
	    			arr[i][j] = "★";
	    		}
	    		System.out.print(arr[i][j]);
	    	}
	    	System.out.println("");
	    }
	    for(int i = cnt; i < arr.length; i++) {
	    	for(int j = 0; j < arr[i].length; j++) {
	    		if(j > arr[i].length - i - 1 + cnt) {
	    			arr[i][j] = " ";
	    		}else {
	    			arr[i][j] = "★";
	    		}
	    		System.out.print(arr[i][j]);
	    	}
	    	System.out.println("");
  	}	
	
	    /*** 코드 종료 ***/

  }

}