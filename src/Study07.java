public class Study07 {
    
    public static void main(String[] args) {
        Study07 study = new Study07();
        study.문제1(); // 문제 1번 실행 메소드
        study.문제2(); // 문제 2번 실행 메소드
        study.문제3(); // 문제 3번 실행 메소드
    }
    
    private void 문제1() {
        // int a = 10;
        // boolean b = false;
        // System.out.print( (a + b) );
    }

    private void 문제2() {
        String a = "자바";
        String b = new String("자바");
        if(a == b) { // a.equals(b) 방식으로 비교
            System.out.print("참");
        } else {
            System.out.print("거짓");
        }
    }

    private void 문제3() {
        for(int 단 = 1; 단 <= 9; 단++) {
            if(단%2 != 0) continue;
            System.out.println(단 + "단");
            for(int i = 1; i <= 9; i++) {
                System.out.print(단 + " * " + i + " = " + (단 * i) + "\t" );
            }
            System.out.println();
        }
    }

}
