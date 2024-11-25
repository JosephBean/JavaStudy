public class Study17 {
    public static void main(String[] args) {
        new S17A().run();
    }
}

class S17AB {
    public void run() {
        System.out.println("안녕하세요.");
    }
}

class S17A extends S17AB {

}

class S17B extends S17AB {

}
