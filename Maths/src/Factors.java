public class Factors {
    public static void main(String[] args) {
        int n = 20;
        factors(n);
    }

    private static void factors(int n) {
        for(int i=1; i<=Math.sqrt(n); i++) {
            if(n % i == 0) {
                if(i == n/i)
                    System.out.print(i + " ");
                else
                    System.out.print(i + " " + n/i + " ");
            }
        }
    }
}