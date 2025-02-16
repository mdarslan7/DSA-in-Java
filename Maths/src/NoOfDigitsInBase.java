public class NoOfDigitsInBase {
    public static void main(String[] args) {
        int n = 10;
        int b = 2;

        int digits = (int)(Math.log(n) / Math.log(b)) + 1;
        System.out.println(digits);
    }
}
