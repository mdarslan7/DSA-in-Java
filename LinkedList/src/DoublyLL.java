public class DoublyLL {
    private Node head;

    public void insertAtBeginning(int val) {
        Node node = new Node(val);          //when we provide val, the other two ref variables i.e. next and prev are automatically taken as null
        node.next = head;
        node.prev = null;
        if(head != null)
            head.prev = node;           //if there is no element
        head = node;
    }

    public void insertAtEnd(int val) {
        Node node = new Node(val);
        Node last = head;
        node.next = null;

        if(head == null) {
            node.prev = null;
            head = node;
            return;
        }

        while(last.next != null) {
            last = last.next;
        }

        last.next = node;
        node.prev = last;
    }

    public void insertAfterAValue(int after, int val) {
        Node p = find(after);

        if(p == null) {
            System.out.println("Does not exist");
            return;
        }

        Node node = new Node(val);
        node.next = p.next;
        p.next = node;
        node.prev = p;
        if(node.next != null)
            node.next.prev = node;
    }

    public Node find(int value) {
        Node node = head;
        while(node != null) {
            if(node.val == value)
                return node;
            node = node.next;
        }
        return null;
    }

    public void display() {
        Node temp = head;
        Node last = null;
        while(temp != null) {
            System.out.print(temp.val + " -> ");
            last = temp;
            temp = temp.next;
        }
        System.out.println("END");

        //Printing in reverse
//        while(last != null) {
//            System.out.print(last.val + " -> ");
//            last = last.prev;
//        }
//        System.out.println("START");
    }

    private class Node {
        Node next;
        Node prev;
        int val;

        public Node(int val) {
            this.val = val;
        }

        public Node(Node next, Node prev, int val) {
            this.next = next;
            this.prev = prev;
            this.val = val;
        }
    }
}
