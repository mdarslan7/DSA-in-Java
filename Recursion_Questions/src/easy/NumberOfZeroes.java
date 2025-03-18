package easy;

public class NumberOfZeroes {
    public static void main(String[] args) {
        System.out.println(zeroes(10));
    }

    private static int zeroes(int n) {
        if(n == 0)
            return 0;

        if((n % 10) != 0)
            return zeroes(n/10);

        return 1 + zeroes(n/10);
    }
}