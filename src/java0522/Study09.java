package java0522;

public class Study09 {

  public static void main(String[] args) {

		/***********************************************
		 * 문제9) 2차원 배열를 이용하여 별(★)를 출력하시오
		 * 출력 예시)
	     *    ★
	     *   ★★★
	     *  ★★★★★
	     * ★★★★★★★
	     *  ★★★★★
	     *   ★★★
	     *    ★
		 ************************************************/

	// 해결 코드 작성 시작

	    String 별 = "★";
	
	    /*** 코드 시작 ***/
	    String[][] arr = new String[7][7];
	    String 빈 = "　";
	    
	    for(int i=0; i<arr.length; i++) {
	    	for(int j=0; j<arr[i].length; j++) {
		    	if((i==0 || i==6) && (j<=2 || j>=4)) {
		    		arr[i][j] = 빈;
		    	} else if((i==1 || i==5) && (j<=1 || j>=5)) {
		    		arr[i][j] = 빈;
		    	} else if((i==2 || i==4) && (j<=0 || j>=6)) {
		    		arr[i][j] = 빈;
		    	} else {
		    		arr[i][j] = 별;
		    	}
		    }
	    }
	
	    /*** 코드 종료 ***/
	    for(int i=0; i<arr.length; i++) {
	    	for(int j=0; j<arr[i].length; j++) {
		    	System.out.print(arr[i][j]);
		    }
	    	System.out.println();
	    }
	    /*** 코드 종료 ***/

  }

}