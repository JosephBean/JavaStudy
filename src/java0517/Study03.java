package java0517;

import java.util.Scanner;

public class Study03 {

	public static void main(String[] args) {

		Scanner a = new Scanner(System.in);
		//System.out.println(a.nextInt());
			
		switch (a.nextInt()) { 
			case 1: System.out.println("값이 1입니다."); 
			break; 
		default:
			System.out.println("값이 1이 아닙니다."); 
		}
		
	}

}
