// This example shall give an index out of bounds error but that would not be the case in an actual infinite array.

public class PositionOfElementInAnInfinitelySortedArray {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 6, 7, 8, 10, 11, 12, 15, 20, 23, 30};
        int target = 15;
        int start = 0;
        int end = start + 1;

        while(arr[end] < target) {
            int temp = end + 1;

            //end = previous end + size of box * 2
            end = end + (end - start + 1) * 2;
            start = temp;
        }

        int index = binarySearch(arr, start, end, target);
        System.out.println(index);
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
