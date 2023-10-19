import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
//        list.add(14);
//        list.add(12);
//        list.add(35);
//        list.add(89);
//        list.add(99);
//        System.out.println(list.contains(99));
//        list.set(4, 98);
//        list.remove(4);
//        System.out.println(list.contains(98));
//        System.out.println(list.get(1));

//        Input
        for(int i=0;  i<5; i++) {
            list.add(sc.nextInt());
        }

//        Get Item
        for(int i=0; i<5; i++) {
            System.out.println(list.get(i));
        }
    }
}
