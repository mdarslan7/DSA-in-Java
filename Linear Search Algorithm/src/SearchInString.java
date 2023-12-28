public class SearchInString {
    public static void main(String[] args) {
        String str = "Arslan";
        char key = 'a';
        System.out.println(searchInString(str, key));
    }

    static boolean searchInString(String str, char key) {
        if(str.length() == 0)
            return false;

        for(char i: str.toCharArray()) {
            if(i == key)
                return true;
        }

        return false;
    }
}
