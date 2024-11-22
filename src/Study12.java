public class Study12 {
    String o = "O";
    String 빈 = "X";
    public static void main(String[] args) {
        Study12 클래스 = new Study12();
        // 2차원 배열에 값 넣기
        String[][] 문제1 = 클래스.문제1값();
        // 2차원 배열에 있는 값 확인
        클래스.배열확인(문제1);
    }

    private String[][] 문제1값() {
        String[][] 문제1 = new String[10][10];
        for (int i = 0; i < 문제1.length; i++) {
            for (int j = 0; j < 문제1[i].length; j++) {
                if(j <= i) {
                    문제1[i][j] = o;
                } else {
                    문제1[i][j] = 빈;
                }
            }
        }
        return 문제1;
    }

    private void 배열확인(String[][] 배열) {
        for(int i = 0; i < 배열.length; i++) {
            for(int j = 0; j < 배열[i].length; j++) {
                System.out.print(배열[i][j]);
            }
            System.out.println();
        }
    }

}
