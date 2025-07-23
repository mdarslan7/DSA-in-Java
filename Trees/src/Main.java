//import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Binary Tree

//        BinaryTree tree = new BinaryTree();
//        Scanner sc = new Scanner(System.in);
//        tree.populate(sc);
//        tree.prettyDisplay();

        //BST
//        BST tree = new BST();
//        int[] arr = {1, 2, 3};
//        tree.populate(arr);
//        tree.display();
//        tree.preOrder();
//        System.out.println();
//        tree.inOrder();
//        System.out.println();
//        tree.postOrder();

        //AVL
        AVL tree = new AVL();

        for(int i=0; i<1000; i++) {
            tree.insert(i);
        }

        System.out.println(tree.height());
    }
}