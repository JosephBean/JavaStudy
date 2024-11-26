
import java.util.HashMap;
import java.util.Map;

public class Study23 {
    public static void main(String[] args) {
        Map map = new HashMap<>();
        map.put("no", 1);
        map.put("name", "홍길동");

        System.out.println( map.get("no") );

        System.out.println( map.size() );

        map.remove("no");

        System.out.println(map);

    }
}
