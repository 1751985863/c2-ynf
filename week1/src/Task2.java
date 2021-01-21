import java.util.Arrays;

public class Task2 {

    public static void main(String[] args) {
        Integer a = 1,b=2;
        System.out.println(Arrays.toString(exchange(a,b)));
        int [] n = new int[] {1,2,3,4};
        change(n);
        System.out.println(Arrays.toString(n));
    }
    public static int[] exchange(Integer a,Integer b) {
        int temp = a;
        a = b;
        b = temp;
        return new int[]{a,b};
    }
    public static void change(int[] n) {

        for (int l = 0,r = n.length - 1; l < r; l++,r--) {
            int temp = n[l];
            n[l] = n[r];
            n[r] = temp;
        }
    }
}
