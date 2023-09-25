// Example of passing using arrays

public class Main {
    public static void main(String[] args) {
        int[] x = new int[5];
        x[0] = 1;
        System.out.println("Before the function: " + x[0]);
        change(x);
        System.out.println("After function execution: ");
        System.out.println(x[0]);
    }

    static void change(int[] x) {
        x[0] = 20;
        System.out.println("From inside function change: " + x[0]);
    }
}