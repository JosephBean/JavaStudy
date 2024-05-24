package java0524;

/**
 * 객체를 다루기 위해서 두가지를 학습하자!
 * 메소드 > 함수형 : 호출(입력)      ->>> 반환(출력)
 * 클래스 > 객체형 : 생성자(인스턴스) ->>>  객체를 받는다.
 * **/


public class Study00 {

	public static void main(String[] args) {
		함수();
		옆친구 울지마 = new 옆친구();
		울지마.함수();
		//울지마.함수(1);
		//울지마.함수("");
	}
	
	Study00() {}
	Study00(int a) {}
	Study00(String a) {}
	
	
	static void 함수() {}
	static void 함수(int a) {}
	static void 함수(String a) {}

}
