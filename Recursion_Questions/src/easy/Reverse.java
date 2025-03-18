package easy;

public class Reverse {
    public static void main(String[] args) {
        System.out.println(reverse(123, 3));
    }

    private static int reverse(int n, int digits) {
        if(n % 10 == n)
            return n;

        return (n % 10) * (int) Math.pow(10, digits-1) + reverse(n / 10, --digits);
    }
}
