package y2025;

public class Study03 {

	public static void main(String[] args) {
		System.out.print( new D().toString() );
//		Study03.super.toString(); // 오류
	}

}

class D {

	@Override
	public String toString() {
		System.out.println( D.super.toString() );
		return "D 클래스 입니다";
	}
	
}
