package y2025;

public class Study07 {
	public static void main(String[] args) {
		// 문제) lambda 식으로 만드시오.
		슈퍼계산기 합 = (a,b) -> a + b;
		슈퍼계산기 빼기 = (a,b) -> a - b;
		System.out.println(합.계산하기(10, 5));
		System.out.println(빼기.계산하기(10, 5));
		합.print();
		빼기.print();
	}
}

interface 슈퍼계산기 {
	final String title = "print : ";
	int 계산하기(int a, int b);
	default void print() {
		System.out.println( title + 계산하기(10, 5) );
	}
}

/*************************************************
 * 해당 기능 method를 만들고 사용하는 방법
 * 계산기 산기 = new 계산기();
 * 산기.합(10, 5);  	// 결과값 >>> 15
 * 산기.빼기(10, 5);	// 결과값 >>> 5
 *************************************************/
class 계산기 {
	int 합(int a, int b) {
		return a + b;
	}
	int 빼기(int a, int b) {
		return a - b;
	}
}
