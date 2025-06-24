public class CircularLL {
    private Node head;
    private Node tail;

    public CircularLL() {
        head = null;
        tail = null;
    }

    public void insert(int value) {
        Node node = new Node(value);
        if(head == null) {
            head = node;
            tail = node;
            return;
        }
        tail.next = node;
        node.next = head;
        tail = node;
    }

    public void delete(int val) {
        Node node = head;
        if(node == null) {
            return;
        }

        while(node.next.value != val) {
            node = node.next;
        }

        Node temp = node.next;
        node.next = node.next.next;
        if(temp == head) {
            head = node.next;
        }
    }

    public void display() {
        Node node = head;
        if(head != null) {
            do {
                System.out.print(node.value + " -> ");
                node = node.next;
            } while(node != head);
        }
        System.out.println("HEAD");
    }

    private class Node {
        int value;
        Node next;

            public Node(int value) {
                this.value = value;
            }
    }
}
