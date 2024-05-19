public class FindInMountainArray {
    public static void main(String[] args) {
        int[] arr = {0, 5, 3, 1};
        int target = 1;

        int peak = peakElement(arr);

        int ans = orderAgnosticBS(arr, 0, peak, target);

        if(ans != -1)
            System.out.println(ans);
        else {
            ans = orderAgnosticBS(arr, peak+1, arr.length-1, target);
            System.out.println(ans);
        }
    }

    static int peakElement(int[] arr) {
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

    static int orderAgnosticBS(int[] arr, int start, int end, int target) {
        boolean isAsc = arr[start] < arr[end];

        while(start <= end) {
            int mid = start + (end-start)/2;

            if(arr[mid] == target) {
                return mid;
            }

            if(isAsc) {
                if (arr[mid] < target) {
                    start = mid + 1;
                }
                else {
                    end = mid - 1;
                }
            }

            else {
                if (arr[mid] > target) {
                    start = mid + 1;
                }
                else if (arr[mid] < target) {
                    end = mid - 1;
                }
            }
        }

        return -1;
    }
}
