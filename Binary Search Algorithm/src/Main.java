public class Main {
    public static void main(String[] args) {
        int[] arr = {-12, -7, -4, 0, 6, 9, 15, 31};
        int target = 90;
        int searchedIndex = binarySearch(arr, target);
        System.out.println("Index: " + searchedIndex);
    }

    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;

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