import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        int[] nums = new int[] {6,2,2,3};
        Arrays.sort(nums);

        for (int num : nums) {
            System.out.println(num);
        }
    }
}
