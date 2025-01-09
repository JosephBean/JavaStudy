package y2025;

import java.util.List;

public class Study09 {

	public static void main(String[] args) {		
		
		List<Integer> list = List.of(1,2,3,4,5,6);
		int i = 0;
		// i < list.size()
		// i++

		//  (1)         (2)         (3)
		//  초기화	  반복조건			증감식
		for(      ;   i < 10        ;       ) {
//			i += 2;
			System.out.println(i);
			i += 2;
		}
		
//		System.out.println();
		for(Integer v : list) {
			System.out.println(v);
		}
//		System.out.println();
//		list.forEach(v -> {System.out.println(v);});
//		
//		System.out.println();
//		list.forEach(System.out::println);
	}
	
}
