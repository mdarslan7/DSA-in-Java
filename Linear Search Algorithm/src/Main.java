public class Main {
    public static void main(String[] args) {
        int[] arr = {12, 45, 65, 23, 22};
        int key = 22;
        System.out.println(linearSearch(arr, key));
    }

    static int linearSearch(int[] arr, int key) {
        if(arr.length == 0)
            return -1;


        for(int i=0; i<arr.length; i++) {
            if (arr[i] == key)
                return i;
        }

        return -1;
    }
}