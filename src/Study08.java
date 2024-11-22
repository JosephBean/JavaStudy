public class Study08 {
    public static void main(String[] args) {
        
        int[] a = new int[5];
        // 1, 2, 3, 4, 5
        // 0, 1, 2, 3, 4  << index
        // a[1] >> 1
        // a[4] >> 5

        a[0] = 1;
        a[1] = 2;
        a[2] = 3;
        a[3] = 4;
        a[4] = 5;

        // System.out.println(a[1]);

        int[] b = new int[] {6,7,8,9,10};
        // System.out.println(b[3]);

        b[0] = 11;
        System.out.println(b[0]);
    }
}
