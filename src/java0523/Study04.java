package java0523;

import java.util.Scanner;

/*********************************
 * >> Console 입력 알아보기
 * Scanner 클래스를 이용하여 설문조사 하기
 *********************************/

public class Study04 {

	public static void main(String[] args) {

		/** 객체 생성 **/
		Scanner sc = new Scanner(System.in);
		
		/** 객체 사용 **/
		
		String q1 = "당신의 이름은?";
		String q2 = "당신의 나이는?";
		String q3 = "당신의 성별은?";
		String q4 = "당신의 나라는?";
		String q5 = "당신의 살고 있는 지역은?";
		String q6 = "당신의 학력은?";
		String q7 = "당신의 취미는?";
		String q8 = "당신의 직업은?";
		String q9 = "당신은 일주일에 3회 이상 대화하는 상대가 있습니까?";
		String q10 = "당신은 하루의 세끼를 다 챙겨 먹습니까?";
		
//		String[] 배열1 = new String[] {q1,q2,q3,q4,q5,q6,q7,q8,q9,q10};
//		
//		for(int i = 0; i < 배열1.length; i++) {
//			System.out.println(배열1[i]);
//			System.out.println(sc.nextLine());
//		}
		
		String[][] 배열2 = new String[][] {{q1, ""},{q2, ""},{q3, ""},
								{q4, ""},{q5, ""},{q6, ""},
								{q7, ""},{q8, ""},{q9, ""},{q10, ""}};
		
		for(int i = 0; i < 배열2.length; i++) {
			System.out.println(배열2[i][0]);
			String 답변 = sc.nextLine();
			배열2[i][1] = 답변;
		}
								
		for(int i = 0; i < 배열2.length; i++) {
			System.out.print(배열2[i][0] + "\t");
			System.out.println("->" + 배열2[i][1]);
		}
		 
		/** 객체 제거 **/
		sc.close();
		
	}

}
