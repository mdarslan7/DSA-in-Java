public class Shadowing {
    static int x = 10;  //This class variable gets shadowed at line 6 by local variable
    public static void main(String[] args) {
        System.out.println(x);
        int x = 40;
        System.out.println(x);
        fun();
    }

    static void fun() {
        System.out.println(x);
    }
}
