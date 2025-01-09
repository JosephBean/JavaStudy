package y2025;

import java.util.function.BiFunction;

public class Study08 {

	public static void main(String[] args) {
		int 첫번째 = 10;
		int 두번째 = 5;
		BiFunction<Integer, Integer, String> 합 = (a, b) -> {
			return (a + b) + "";
		};
		System.out.println( 첫번째 + " + " + 두번째 + " = " + 합.apply(첫번째, 두번째));
	}

}
