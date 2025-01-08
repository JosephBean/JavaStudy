package y2025;

public class Study04 {
	public static void main(String[] args) {
		System.out.println( new EEE().name );
		System.out.println( new EEE("지현").name );
	}
}
class E {
	String name;
}
class EE extends E {
	public EE() {}
	public EE(String name) {super.name = name;}
}
class EEE extends EE {
	public EEE() {}
	public EEE(String name) {super.name = name;}
}
