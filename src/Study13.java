public class Study13 {

    int 일;
    int 이;

    public static void main(String[] args) {
        Study13 클래스 = new Study13();
        System.out.println(클래스.일 + ", " + 클래스.이);
        클래스.b();
        System.out.println(클래스.일 + ", " + 클래스.이);
        // int[] 배열 = 클래스.a();
        // int 일 = 배열[0];
        // int 이 = 배열[1];
    }

    int[] a() {
        int 일 = 1;
        int 이 = 2;
        return new int[] {일,이};
    }

    void b() {
        일 = 10;
        이 = 20;
    }

}
