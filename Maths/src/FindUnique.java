public class FindUnique {
    static int unique(int[] arr) {
        int uniq = 0;
        for(int n: arr) {
            uniq ^= n;
        }
        return uniq;
    }
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 1, 3, 2, 4};
        System.out.println(unique(arr));
    }
}
