public class Study10 {
    public static void main(String[] args) {
        String[] 단1 = new String[9];
        int[] 단1값 = new int[9];
        for(int i = 1; i <= 단1.length; i++) {
            // System.out.println(1 + " * " + i + " = " + (1*i));
            // System.out.println(i-1);
            단1값[i-1] = (1 * i);
            단1[i-1] = (1 + " * " + i + " = " + (1*i));
            System.out.println(단1[i-1]);
            System.out.println(단1값[i-1]);
        }
    }
}
