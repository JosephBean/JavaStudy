public class Study12 {
    String o = "O";
    String 빈 = "X";
    public static void main(String[] args) {
        Study12 클래스 = new Study12();
        // 클래스.배열확인(클래스.문제1값());
        // 클래스.배열확인(클래스.문제2값());
        클래스.배열확인(클래스.문제3값());
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

    private String[][] 문제2값() {
        String[][] 문제2 = new String[10][10];
        for(int i = 0; i < 문제2.length; i++) {
            for(int j = 0; j < 문제2[i].length; j++) {
                // if(j < i) {
                //     문제2[i][j] = 빈;
                // } else {
                //     문제2[i][j] = o;
                // }
                문제2[i][j] = (j < i) ? 빈 : o;
                // 행의 인덱스가 0이면 모두 'O'로 채우고
                // 행의 인덱스가 1부터 열의 인덱스와 비교하여 채워질 칸을 채운다.
                // 열 < 행 조건식을 사용했을 경우
                // [1,0]  
                // [2,0] [2,1]
                // [3,0] [3,1] [3,2]
            }
        }
        return 문제2;
    }

    private String[][] 문제3값() {
        String[][] 문제3 = new String[10][10];
        for(int i = 0; i < 문제3.length; i++) {
            for(int j = 0; j < 문제3[i].length; j++) {
                // 0 ~ 8   < 9   (10 - 1) 행 = 0
                // 0 ~ 7   < 8   (10 - 2) 행 = 1
                // 0 ~ 6   < 7   (10 - 3) 행 = 2
                if(j < 문제3[i].length - (i+1)) {
                    문제3[i][j] = 빈;
                } else {
                    문제3[i][j] = o;
                }
            }
        }
        return 문제3;
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
