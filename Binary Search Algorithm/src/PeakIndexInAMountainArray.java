public class PeakIndexInAMountainArray {
    public static void main(String[] args) {
        int[] arr = {0, 10, 5, 2};

        int ans = binarySearch(arr);
        System.out.println(ans);
    }

    static int binarySearch(int[] arr) {
        int start = 0;
        int end = arr.length-1;

        while(start != end) {
            int mid = start + (end-start)/2;

            if(arr[mid] > arr[mid+1]) {
                //in decreasing part of the array,
                // can be an answer but have to check in left side
                end = mid;
            }

            else {
                //in increasing part of the array,
                // can't be the answer because we want the maximum number,
                // also mid can't be the answer, so we shall do, start = mid + 1
                start = mid + 1;
            }
        }
        return start;
    }
}
