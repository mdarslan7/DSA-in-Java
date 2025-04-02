package strings;

import java.util.ArrayList;

public class Subseq {
    public static void main(String[] args) {
        subSeq("", "abc");
        ArrayList<String> list = subSeqRet("", "abc");
        System.out.println(list);
    }

    static void subSeq(String p, String up) {     // p -> processed & up -> unprocessed
        if(up.isEmpty()) {
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        subSeq(p + ch, up.substring(1));
        subSeq(p, up.substring(1));
    }

    static ArrayList<String> subSeqRet(String p, String up) {
        if(up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);

        ArrayList<String> left = subSeqRet(p + ch, up.substring(1));
        ArrayList<String> right = subSeqRet(p, up.substring(1));

        left.addAll(right);

        return left;
    }
}
