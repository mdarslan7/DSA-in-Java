import java.util.Arrays;

public class Varargs {
    public static void main(String[] args) {
        fun(1, 2, 3, 4, 5, 6, 7);
        multiple(12, 45, "Arslan", "Arman", "Imran");
    }

    static void multiple(int a, int b, String ...x) {
        System.out.println(Arrays.toString(x));
    }

    static void fun(int ...v) {
        System.out.println(Arrays.toString(v));
    }
}
