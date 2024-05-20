package java0520;

/*********************************
 * >> 반복문 
 * for : for( ; ; ) {}
 *********************************/

public class Study01 {

	public static void main(String[] args) {
		
		for( ; ; ) {
			System.out.println("반복문");
			break;
		}
		
		int tot = 0;
		
		for (int i = 1; i <= 10 ; i++) { // i >> (1 > 2 > 3 > 4 > 5 > 6 > 7 > 8 > 9 > 10) 
//			System.out.println("전 : " + i);
			tot += i;
//			System.out.println("후 : " + i);
		}
		
		System.out.println("반복문의 합 : " + tot);
	}

}
