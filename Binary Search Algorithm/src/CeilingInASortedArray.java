public class CeilingInASortedArray {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        int ceil = ceilingBinarySearch(arr, 19);
        System.out.println("Ceiling: " + ceil);
    }

    static int ceilingBinarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;

        //We need to find smallest element greater than or equal to target
        //but what if the target itself is greater than the greatest element
        //return -1 in that case

        if(target > arr[end]) {
            return -1;
        }

        while(start <= end) {
            int mid = start + (end-start)/2;
            if (arr[mid] < target) {
                start = mid + 1;
            }
            else if (arr[mid] > target) {
                end = mid - 1;
            }
            else {
                return arr[mid];
            }
        }

        return arr[start];
    }
}

// Alternate Approach

//public class CeilingInASortedArray {
//    public static void main(String[] args) {
//        int[] arr = {2, 3, 5, 9, 14, 16, 18};
//        int target = 14;
//        int ceil = binarySearch(arr, target);
//        System.out.println("Ceiling: " + ceil);
//    }
//
//    static int binarySearch(int[] arr, int target) {
//        int start = 0;
//        int end = arr.length-1;
//        int ceil = Integer.MIN_VALUE;
//
//        while(start <= end) {
//            int mid = start + (end-start)/2;
//            if (arr[mid] < target) {
//                start = mid + 1;
//            }
//            else if (arr[mid] > target) {
//                ceil = arr[mid];
//                end = mid - 1;
//            }
//            else {
//                return arr[mid];
//            }
//        }
//
//        return ceil;
//    }
//}
