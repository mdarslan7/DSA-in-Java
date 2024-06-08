//Amazon
//Given an array nums containing n distinct numbers in the range [0, n],
// return the only number in the range that is missing from the array.

public class MissingNumber {
    public static void main(String[] args) {
        int[] nums = {4, 0, 2, 1, 1};
        System.out.println(missingNumber(nums));
    }
    static int missingNumber(int[] nums) {
        int n = nums.length;
        int i = 0;

        while(i < n) {
            int correctIndex = nums[i];

            if(correctIndex == n) {
                i++;
                continue;
            }

            if(nums[correctIndex] != nums[i]) {
                int temp = nums[correctIndex];
                nums[correctIndex] = nums[i];
                nums[i] = temp;
            } else {
                i++;
            }
        }

        for (i=0; i<nums.length; i++) {
            if (i != nums[i]) {
                return i;
            }
        }
        return n;
    }
}