public class Main {
    public static void main(String[] args) {
//        SinglyLL list = new SinglyLL();
//        list.insertAtBeginning(2);
//        list.insertAtBeginning(4);
//        list.insertAtBeginning(8);
//        list.insertAtBeginning(10);
//        list.insertAtEnd(15);
//        list.insertAtAnIndex(17, 4);
//        list.display();
//        list.deleteAtAnIndex(3);
//        list.display();
//        System.out.println(list.find(8));

        DoublyLL list = new DoublyLL();
        list.insertAtBeginning(14);
        list.insertAtBeginning(25);
        list.insertAtBeginning(12);
        list.insertAtBeginning(56);
        list.insertAtEnd(43);
        list.display();
        list.insertAfterAValue(12, 1);
        list.display();
    }
}