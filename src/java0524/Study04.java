package java0524;

public class Study04 {

	static int a = 0;
	static int c = 0;
	
	public static void main(String[] args) {

		System.out.println(a);
		int c = b();
		System.out.println(c);
	}
	
	static int b() {
		int c = 5;
//		this.c = c;
		System.out.println(a);
		return c;
	}

}
