package java0521;

public class Study01 {

	public static void main(String[] args) {

		for(int 증가값 = 1; 증가값  < 10; 증가값 ++){
			//System.out.println(증가값);
		}
		

		int 단 = 1;
		while(단 < 10) {
			//System.out.println(단);
		    단++;
		}
		
		
		//int 단 = 1;
		while(단 < 10) {
			for(int 증가값 = 1; 증가값  < 10; 증가값 ++){
				System.out.println(단 + " * " + 증가값 + " = " + (단 * 증가값));
			}
		    단++;
		}
		
	}

}
