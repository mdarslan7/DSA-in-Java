public class NewtonRaphson {
    public static void main(String[] args) {
        System.out.println(sqrt(40));
    }

    private static double sqrt(int n) {
        double x = n;
        double root;

        while(true) {
            root = 0.5 * (x + (n/x));
            double error = Math.abs(root - x);

            if(error < 1)
                break;

            x = root;
        }

        return root;
    }
}
