public class Study15_2 {

    public Study15_2() {}
    public Study15_2(int a, int b) {
        this.a = a;
        this.b = b;
    }
    private int a;
    private int b;

    @Override
    public String toString() {
        return "Study15_2 {a :" + a + ", b:" + b + "}";
    }
    
    public void 더하기() {
        System.out.println(a + b);
    }

    public void 빼기() {
        System.out.println(a - b);
    }

    public void 빼기(int a, int b) {
        System.out.println(a - b);
    }

}
