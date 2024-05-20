package java0520;

public class Study06 {

	public static void main(String[] args) {
		
//		String[][] 배열 = new String[][] {
//			{"O","X","X","X","X","X","X","X","X","X"},
//			{"O","O","X","X","X","X","X","X","X","X"},
//			{"O","O","O","X","X","X","X","X","X","X"},
//			{"O","O","O","O","X","X","X","X","X","X"},
//			{"O","O","O","O","O","X","X","X","X","X"},
//			{"O","O","O","O","O","O","X","X","X","X"},
//			{"O","O","O","O","O","O","O","X","X","X"},
//			{"O","O","O","O","O","O","O","O","X","X"},
//			{"O","O","O","O","O","O","O","O","O","X"},
//			{"O","O","O","O","O","O","O","O","O","O"}
//		};
		
		String[][] 배열 = new String[10][10];
		
		for(int i = 0; i < 배열.length; i++) {
			for(int j = 0; j < 배열[i].length; j++) {
				// 0  <  1
				if(j < (i+1) ) {
					배열[i][j] = "O";
				} else {
					배열[i][j] = "X";
				}
				System.out.print(배열[i][j] + "\t");
			}
			System.out.println();
		}
		
		
//		for(int i = 0; i < 배열.length; i++) {
//			for(int j = 0; j < 배열[i].length; j++) {
//				System.out.print(배열[i][j] + "\t");
//			}
//			System.out.println();
//		}
		
	}

}
