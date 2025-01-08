package y2025;

public class Study07 {
	public static void main(String[] args) {
		계산기 산기 = new 계산기();
		산기.합(10, 5);  	// 결과값 >>> 15
		산기.빼기(10, 5); 	// 결과값 >>> 5
		// 람다식을 이용하여 인터페이스 슈퍼계산기로 연산하시오.
		슈퍼계산기 합, 빼기;
		// 1. 합을 구하기
		// 2. 빼기를 구하기
	}
}

interface 슈퍼계산기 {
	int 계산하기(int a, int b);
}

class 계산기 {
	int 합(int a, int b) {
		return a + b;
	}
	int 빼기(int a, int b) {
		return a - b;
	}
}
