public class Study19 {
    public static void main(String[] args) {
        정보 정보1 = new 강아지();
        정보 정보2 = new 고양이();
        System.out.println(정보1.종류());
        System.out.println(정보1.소리());

        System.out.println(정보2.종류());
        System.out.println(정보2.소리());
    }
}

class 강아지 implements 정보 {

    @Override
    public String 종류() {
        return "개과";
    }

    @Override
    public String 소리() {
        return "멍멍";
    }
    
}

class 고양이 implements 정보 {

    @Override
    public String 종류() {
        return "고양이과";
    }

    @Override
    public String 소리() {
        return "야옹";
    }
    
}

interface 정보 {
    String 종류();
    String 소리();
}
