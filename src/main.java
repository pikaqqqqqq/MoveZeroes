/**
 * Created by think on 2018/1/2.
 */
public class main {
    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        moveZeroes2(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]);
        }
    }

    //num of operation:nums.length
    public static void moveZeroes1(int[] nums) {
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

    //num of operation:2 * num of non-zore
    //lost of zero
    public static void moveZeroes2(int[] nums) {
        if (nums.length < 2) return;
        int temp;
        for (int i = 0, j = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                temp = nums[i];
                nums[i] = nums[j];
                nums[j++] = temp;
            }
        }
    }
}

