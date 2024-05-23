// Using Binary Search to find peak
public class SearchInARotatedSortedArray_PeakUsingBinary {

    public static void main(String[] args) {
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int target = 7;

        int peak = findPeak(nums);

        int ans = binarySearch(nums, 0, peak, target);

        if(ans != -1)
            System.out.println(ans);
        else {
            ans = binarySearch(nums, peak+1, nums.length-1, target);
        }
        System.out.println(ans);
    }
    static int findPeak(int[] arr) {
        int start = 0;
        int end = arr.length-1;

        while(start <= end) {
            int mid = start + (end-start)/2;

            //4 Cases
            if (mid < end && arr[mid] > arr[mid+1])
                return mid;

            if(mid > start && arr[mid] < arr[mid-1])
                return mid-1;

            if(arr[start] >= arr[mid]) {
                end = mid-1;
            } else {
                //pivot cannot be mid as it have been caught through above conditions
                start = mid+1;
            }
        }
        return -1;
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

    //for array with duplicates
    static int findPivotWithDuplicates(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            // 4 cases over here
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid-1;
            }

            // if elements at middle, start, end are equal then just skip the duplicates
            if (arr[mid] == arr[start] && arr[mid] == arr[end]) {
                // skip the duplicates
                // NOTE: what if these elements at start and end were the pivot??
                // check if start is pivot
                if (start < end && arr[start] > arr[start + 1]) {
                    return start;
                }
                start++;

                // check whether end is pivot
                if (end > start && arr[end] < arr[end - 1]) {
                    return end - 1;
                }
                end--;
            }
            // left side is sorted, so pivot should be in right
            else if(arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
