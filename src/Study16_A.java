public class Study16_A {

    public Study16_A() {}
    public Study16_A(String msg) {
        System.out.println("전달 받은 내용 : " + msg);
        run();
    }
    
    public void run() {
        new Study16_B("B 안녕!");
    }
}
