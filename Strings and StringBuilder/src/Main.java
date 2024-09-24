public class Main {
    public static void main(String[] args) {
        String a = "arslan";
        String b = "arslan";

        System.out.println(a == b); //checks if both ref variable are pointing to same object
        System.out.println(a.equals(b)); //checks only the value

        String str1 = new String("arslan");
        String str2 = new String("arslan");

        System.out.println(str1 == str2); //false
        System.out.println(str1.equals(str2));
    }
}