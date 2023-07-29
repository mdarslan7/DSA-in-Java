public class Call_by_value {
    public static void main(String[] args) {
        int x = 12;
        changeNumber(x);
        System.out.println(x);
    }

    static void changeNumber(int x) {
        x = 24;
    }
}
