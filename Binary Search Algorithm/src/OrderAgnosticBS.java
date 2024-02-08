public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] arr = {3, 2, 1};
        int target = 2;
        int searchedIndex = orderAgnosticBS(arr, target);
        System.out.println("Index: " + searchedIndex);
    }

    static int orderAgnosticBS(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

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

