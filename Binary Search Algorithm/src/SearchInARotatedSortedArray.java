
// Using Linear Search to find peak
public class SearchInARotatedSortedArray {
    public static void main(String[] args) {
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;

        int peak = nums[0];
        int index = 0;
        for(int i=1; i<nums.length; i++) {
            if(nums[i] > peak) {
                peak = nums[i];
                index = i;
            }
        }

        int ans = binarySearch(nums, 0, index, target);
        if(ans != -1)
            System.out.println(ans);
        else {
            ans = binarySearch(nums, index+1, nums.length-1, target);
        }
        System.out.println(ans);
    }

    static int binarySearch(int[] arr, int start, int end, int target) {
        while(start <= end) {
            int mid = start + (end-start)/2;
            if (arr[mid] < target) {
                start = mid + 1;
            }
            else if (arr[mid] > target) {
                end = mid - 1;
            }
            else {
                return mid;
            }
        }

        return -1;
    }
}