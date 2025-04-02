package strings;

public class Stream {
    public static void main(String[] args) {
//        skip("baccadh", "");
//        System.out.println(skip("baccadhewawae"));
        System.out.println(skipApple("baccdhapplehsbg"));
    }

    static void skip(String str, String ans) {
        if(str.isEmpty()) {
            System.out.println(ans);
            return;
        }

        char ch = str.charAt(0);

        if(ch == 'a')
            skip(str.substring(1), ans);
        else
            skip(str.substring(1), ans + ch);
    }

    static String skip(String str) {
        if(str.isEmpty()) {
            return "";
        }

        char ch = str.charAt(0);

        if(ch == 'a')
            return skip(str.substring(1));
        else
            return ch + skip(str.substring(1));
    }

    static String skipApple(String str) {
        if(str.isEmpty()) {
            return "";
        }

        char ch = str.charAt(0);

        if(str.startsWith("apple"))
            return skipApple(str.substring(5));
        else
            return ch + skipApple(str.substring(1));
    }
}
