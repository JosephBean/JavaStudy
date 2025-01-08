package y2025;

interface G {
	int get();
}
public class Study06 {
	public static void main(String[] args) {
		G g1 = () -> {return 10;};
		G g2 = () -> 10;
		System.out.println( g2.get() );
		System.out.println( g1.get() );
		
		int result = 메소드( () -> 10  );
		System.out.println( result );
	}
	public static int 메소드(G g) {
		return g.get();
	}
}


