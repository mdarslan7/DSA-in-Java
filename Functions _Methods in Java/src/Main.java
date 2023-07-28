import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter your name: ");
        String name = sc.next();
        String personalized = greet(name);
        System.out.println(personalized);
    }

    static String greet(String name) {
        return "Hello " + name + "!";
    }
}