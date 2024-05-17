package java0517;

/*********************************
 * >> 조건문 
 * if 		: if(조건식) {}
 * else	if	: if(조건식) {} else if(조건식) {}
 * else		: if(조건식) {} else {}
 *********************************/
public class Study02 {

	public static void main(String[] args) {

		boolean 논리값 = true;
		/*
		 * if(true) { System.out.println("참"); 논리값 = false; }
		 * 
		 * if(논리값) { System.out.println("논리값이 참이다."); }
		 */
		
		if(!논리값) {
			System.out.println("부정의 논리값");
		}
		
		int a, b;
		a = 5;		// 5;
		b = ++a;	// 6;
		
		System.out.println(a + " : " + b);
		
		if(a == b) {
			System.out.println("a와 b는 같다");
		} else {
			System.out.println("a와 b는 다르다.");
		}
		
	}

}
