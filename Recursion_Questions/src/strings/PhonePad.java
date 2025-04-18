package strings;

import java.util.ArrayList;

public class PhonePad {
    public static void main(String[] args) {
        phonePad("", "12");
        ArrayList<String> list = phonePadRet("", "12");
        System.out.println(list);
        System.out.println(phonePadCount("", "12"));
    }

    static void phonePad(String p, String up) {
        if(up.isEmpty()) {
            System.out.println(p);
            return;
        }

        int digit = up.charAt(0) - '0';     //converts '1' to 1
        for(int i = (digit-1)*3; i < digit*3; i++) {
            char ch = (char) ('a' + i);
            phonePad(p + ch, up.substring(1));
        }
    }

    static ArrayList<String> phonePadRet(String p, String up) {
        if(up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();

        int digit = up.charAt(0) - '0';     //converts '1' to 1
        for(int i = (digit-1)*3; i < digit*3; i++) {
            char ch = (char) ('a' + i);
            list.addAll(phonePadRet(p + ch, up.substring(1)));
        }

        return list;
    }

    static int phonePadCount(String p, String up) {
        if(up.isEmpty()) {
            return 1;
        }

        int count = 0;

        int digit = up.charAt(0) - '0';     //converts '1' to 1
        for(int i = (digit-1)*3; i < digit*3; i++) {
            char ch = (char) ('a' + i);
            count += phonePadCount(p + ch, up.substring(1));
        }

        return count;
    }
}
