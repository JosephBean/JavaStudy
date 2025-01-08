package y2025;

public class Study02 {

	public static void main(String[] args) {
		// A 클래스의 생성자가 필요하다.
		new C();
		new C(1);
	}

}

class C extends Object {
	C() {}
	C(int i) {}
}
