public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 45, 67, 76};
        int target = 67;
        System.out.println(recursiveBinarySearch(arr, target, 0, arr.length-1));
    }

    static int recursiveBinarySearch(int[] arr, int target, int s, int e) {
        if(s > e)
            return -1;

        int mid = s + (e - s) / 2;

        if(target == arr[mid])
            return mid;

        if(target < arr[mid])
            return recursiveBinarySearch(arr, target, s, mid-1);

        return recursiveBinarySearch(arr, target, mid+1, e);
    }
}