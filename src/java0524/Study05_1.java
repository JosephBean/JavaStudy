package java0524;

public class Study05_1 {
	
	private int a;
	
	Study05_1() {
		System.out.println(1111111);
	}
	
	Study05_1(int a) {
		System.out.println(a);
		this.a = a;
	}
	
	void b() {
		System.out.println(a);
	}

}
