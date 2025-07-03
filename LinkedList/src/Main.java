public class Main {
    public static void main(String[] args) {
        //Single LinkedList
        SinglyLL list = new SinglyLL();
        list.insertAtBeginning(2);
        list.insertAtBeginning(4);
        list.insertAtBeginning(8);
        list.insertAtBeginning(10);
        list.insertAtEnd(15);
//        list.insertAtAnIndex(17, 4);
//        list.display();
//        list.deleteAtAnIndex(3);
        list.display();
        list.insertRev(11, 3);
        list.display();
        list.bubbleSort();
        list.display();
        list.reverse();
        list.display();

        //Doubly LinkedList
//        DoublyLL list = new DoublyLL();
//        list.insertAtBeginning(14);
//        list.insertAtBeginning(25);
//        list.insertAtBeginning(12);
//        list.insertAtBeginning(56);
//        list.insertAtEnd(43);
//        list.display();
//        list.insertAfterAValue(12, 1);
//        list.display();

        //Circular LinkedList
//        CircularLL list = new CircularLL();
//        list.insert(23);
//        list.insert(54);
//        list.insert(32);
//        list.insert(12);
//        list.display();
//        list.delete(23);
//        list.display();
    }
}