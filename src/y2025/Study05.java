package y2025;

public class Study05 {
	public static void main(String[] args) {
//		F f1 = new FF();		
//		F f2 = new FFF();
//		f1.print();				
//		f2.print();
		
		F f1 = new F();
		F f2 = new F();
		f1.TXT = "길동";
		System.out.println(f2.TXT);
	}
}
class F {
	public static String TXT = null;
	void print() {
		System.out.println(TXT);
	}
}
class FF extends F {  }
class FFF extends F {  }
