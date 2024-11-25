public class Study18 {
    
    public static void main(String[] args) {
        new Study18_C().run();
    }

}

class Study18_C implements Study18_I {

    @Override
    public void run() {
        System.out.println(txt);
    }
    
}

interface Study18_I {
    final String txt = "인터페이스";
    public void run();
}
