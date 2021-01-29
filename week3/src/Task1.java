public class Task1 {
    public static void main(String[] args) {
        System.out.println("hello world");
        //判断 a b 大小 ，a > b 1 反之 0
        int n = fab(2, 1);
        System.out.println(n);

    }
    public static int fab(int a,int b) {
        if (a > b) {
            return 1;
        }
        return 0;
    }



}
