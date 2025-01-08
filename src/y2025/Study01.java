package y2025;

public class Study01 {

	public static void main(String[] args) {
		I i = (System.out::println);
		I a1 = new A();
		A a2 = new A();
		I b1 = new B();
		A b2 = new B();
		i.print("동물 소리"); // 1
		a1.print("야옹");    // 2
		a2.print("멍멍");    // 3
		b1.print("꼬꼬");    // 4
		b2.print("꿀꿀");    // 5
	}

}
interface I {
	void print(String txt);
}
class A implements I {
	public void print(String txt) {System.out.println("A : " + txt);}
}
class B extends A {
	public void print(String txt) {System.out.println("B : " + txt);}
}
