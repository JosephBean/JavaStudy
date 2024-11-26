import java.util.ArrayList;
import java.util.List;

public class Study22 {
    public static void main(String[] args) {
        List<DataA> list = new ArrayList<>();
        DataA a = new DataA();
        a.setNo(10);
        list.add(a);
        System.out.println(list.get(0) instanceof  DataA);
    }
}

class DataA {

    int no;
    String name;
    String pwd;
    int age; 

    // get, set
    public int getNo() {
        return this.no;
    }

    public void setNo(int no) {
        this.no = no;
    }

}
