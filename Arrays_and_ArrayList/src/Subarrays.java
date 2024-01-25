import java.util.ArrayList;

public class Subarrays {

    public static ArrayList<ArrayList<Integer>> findSubarrays(int[] arr) {
        ArrayList<ArrayList<Integer>> subarrays = new ArrayList<>();
        int n = arr.length;

        // Iterate through all possible starting points
        for (int i = 0; i < n; i++) {
            // Iterate through all possible ending points
            for (int j = i; j < n; j++) {
                // Extract the subarray from index i to j
                ArrayList<Integer> subarray = new ArrayList<>();
                for (int k = i; k <= j; k++) {
                    subarray.add(arr[k]);
                }
                subarrays.add(subarray);
            }
        }

        return subarrays;
    }

    public static void main(String[] args) {
        int[] myArray = {1, 2, 3};
        ArrayList<ArrayList<Integer>> result = findSubarrays(myArray);

        // Print the result
        for (ArrayList<Integer> subarray : result) {
            System.out.println(subarray);
        }
    }
}
