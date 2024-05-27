public class RotationCount {
    public static void main(String[] args) {
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int rotcount = findPeak(nums) + 1;
        System.out.println(rotcount);
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
}
