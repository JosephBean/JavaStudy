public class Study11 {
    public static void main(String[] args) {
        String o = "O";
        String x = "X";

        // 문제1 (1차원 배열에 값 넣기)
        // String[] 문제1 = new String[10];
        // for(int i = 0; i < 문제1.length; i++) {
        // //    if (i%2 == 0){
        // //         문제1[i] = o;
        // //    } else {
        // //         문제1[i] = x;
        // //    }
        //     문제1[i] = (i%2 == 0) ? o : x;
        //     System.out.println(문제1[i]);
        // }

        // 문제2 (2차원 배열에 값 넣기)
        String[][] 문제2 = new String[5][3];
        for(int i = 0; i < 문제2.length; i++) { // 행을 위한 FOR문
           
            
            for(int j = 0; j < 문제2[i].length; j++) { // 열을 위한 FOR문
                // if(j == 1) {
                //     문제2[i][j] = (i%2 == 0) ? x : o;
                // } else {
                //     문제2[i][j] = (i%2 == 0) ? o : x;
                // }
                문제2[i][j] = (j == 1) ? ((i%2 == 0) ? x : o) : ((i%2 == 0) ? o : x);
                System.out.print(문제2[i][j]);
            }

            System.out.println();
        }

    }
}
