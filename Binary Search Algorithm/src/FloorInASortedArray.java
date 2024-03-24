public class FloorInASortedArray {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        int floor = floorBinarySearch(arr, 1);
        System.out.println("Floor: " + floor);
    }

    static int floorBinarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;

        //if target is itself smaller than the greatest number smaller than or equal to target
        //-1 shall be returned, hence returning end instead of arr[end]

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

        return end;
    }
}
