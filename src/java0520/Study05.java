package java0520;

public class Study05 {

	public static void main(String[] args) {
		
		int[][] 배열 = new int[4][5];
		
		배열[0][1] = 10;
		배열[2][2] = 20;
		배열[3][3] = 30;

		// 0 , 1 , 2 , 3   마지막 4
		for(int i = 0; i < 배열.length; i++) {
//			System.out.println(배열[i][i]);
			// 1 > [0][0]	= 0
			// 2 > [1][1]	= 0
			// 3 > [2][2]	= 20
			// 4 > [3][3]	= 30
			for(int j = 0; j < 배열[i].length; j++) {
				System.out.print(배열[i][j] + "\t");
			}
			System.out.println();
		}
		
	}

}
