public class SinglyLL {
    private Node head;
    private Node tail;      //head and tail are references here that can point to nodes
    private int size;
    public SinglyLL() {
        this.size = 0;
    }

    public void insertAtBeginning(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;

        if(tail == null) {
            tail = head;
        }

        size++;
    }

    public void insertAtEnd(int val) {
        if(tail == null) {
            insertAtBeginning(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }

    public void insertAtAnIndex(int val, int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Invalid index " + index);
        }

        if(index == 0) {
            insertAtBeginning(val);
            return;
        }

        if(index == size) {
            insertAtEnd(val);
            return;
        }

        Node temp = head;
        int count = 0;
        while(temp.next != null) {
            count++;
            if(count == index) {
                Node node = new Node(val);
                node.next = temp.next;
                temp.next = node;
                size++;
                break;
            }
            temp = temp.next;
        }
    }

    public void deleteFromBeginning() {
        int val = head.value;
        head = head.next;
        if(head == null)
            tail = null;
        System.out.println(val);
    }

    public void display() {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }
    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }
        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}
