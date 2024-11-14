public class Main {
    public static void main(String[] args) {
        message(1);
    }

    static void message(int n) {
        if(n == 5) {
            System.out.println(5);
            return; //the function is returned to, where it was initially called
        }
        System.out.println(n);
        message(n+1);
    }
}