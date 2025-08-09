public class Main {
    public static void main(String[] args) {
        //Constructor 1
        StringBuffer sb = new StringBuffer();
        sb.append("Batman");
        sb.append(" - The Dark Knight");
        System.out.println(sb.toString());

        //Constructor 2
        StringBuffer sb2 = new StringBuffer(30);
        sb2.append("Constructor 2");
        System.out.println(sb2.toString());

        //Constructor 3
        StringBuffer sb3 = new StringBuffer("Constructor 3");
        System.out.println(sb3);

        //Some Methods
        sb.insert(6, " (Bruce Wayne)");
        sb2.replace(0, 1, "c");
        sb3.delete(0, 11);

        System.out.println(sb.toString());
        System.out.println(sb2.toString());
        System.out.println(sb3.toString());
    }
}