package strings;

import java.util.ArrayList;

public class Permutations {
    public static void main(String[] args) {
//        permutations("", "abc");
        ArrayList<String> ans = permutationsList("", "abc");
        System.out.println(ans);
        int count = permutationsCount("", "abc");
        System.out.println(count);
    }

    static void permutations(String p, String up) {
        if(up.isEmpty()) {
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        for(int i=0; i<=p.length(); i++) {
            String s = p.substring(0, i);
            String f = p.substring(i);
            permutations(s + ch + f, up.substring(1));
        }
    }

    static ArrayList<String> permutationsList(String p, String up) {
        if(up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> ans = new ArrayList<>();

        char ch = up.charAt(0);

        for(int i=0; i<=p.length(); i++) {
            String s = p.substring(0, i);
            String f = p.substring(i);
            ans.addAll(permutationsList(s + ch + f, up.substring(1)));
        }

        return ans;
    }

    static int permutationsCount(String p, String up) {
        if(up.isEmpty()) {
            return 1;
        }

        char ch = up.charAt(0);
        int count = 0;

        for(int i=0; i<=p.length(); i++) {
            String s = p.substring(0, i);
            String f = p.substring(i);
            count += permutationsCount(s + ch + f, up.substring(1));
        }

        return count;
    }
}
