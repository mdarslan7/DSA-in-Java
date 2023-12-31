import java.util.HashMap;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        HashMap<Integer, Integer> numMap = new HashMap<>();

        //Populating
        for(int i=0; i<arr.length; i++) {
            numMap.put(arr[i], i);
        }

        //Put value, gets overridden
        numMap.put(2, 1);

        //Access value
        numMap.get(2);

        //Traverse
        Set<Integer> keys = numMap.keySet();
        for(int key: keys) {
            System.out.print(key + " ");
//            System.out.print(numMap.get(key));
        }
    }
}