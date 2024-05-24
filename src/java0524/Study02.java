package java0524;

public class Study02 {
	
	static int b = 0;

	public static void main(String[] args) {

		a();
		
	}
	
	static void a() {
		
		 // 4 | 5X
		if(b < 5) {
			System.out.println("안녕!" + b);
			b++;
			a();
		}
		
	}

}
