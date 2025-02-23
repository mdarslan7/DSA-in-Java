public class SieveOfEratosthenes {
    public static void main(String[] args) {
        int n = 40;
        boolean[] primes = new boolean[n+1];
        //make all values in the primes array, true
        for(int i=0; i< primes.length; i++) {
            primes[i] = true;
        }
        //make 0 and 1 non primes
        primes[0] = false; primes[1] = false;
        sieve(n, primes);
    }

    private static void sieve(int n, boolean[] primes) {
        for(int i=2; i*i < n; i++) {
            if(primes[i]) {
                for(int j=i*2; j<=n; j+=i) {
                    primes[j] = false;
                }
            }
        }
        //printing the numbers
        for(int i=0; i<=n; i++) {
            if(primes[i])
                System.out.print(i + " ");
        }
    }
}