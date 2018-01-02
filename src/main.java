/**
 * Created by think on 2018/1/2.
 */
public class main {
    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        moveZeroes(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]);
        }
    }

    public static void moveZeroes(int[] nums) {
        if (nums.length < 2) return;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[count++] = nums[i];
            }
        }
        for (; count < nums.length; count++) {
            nums[count] = 0;
        }
    }
}

