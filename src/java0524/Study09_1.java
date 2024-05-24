package java0524;

public class Study09_1 {


	Study09_1(int a, int b) {
		단(a, b);
	}
	
 	private void 단(int a, int b) {
		
		for(; a <= b; a++) {
			System.out.println(a + " 단");
			계산(a);
		}
		
	}
	
 	private void 계산(int a) {
		for(int i = 1; i <= 9; i++) {
			System.out.println(a + " * " + i + " = " + (a * i));
		}
	}

	
}
