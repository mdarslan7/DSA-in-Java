public class SinglyLL {
    private Node head;
    private Node tail;      //head and tail are references here that can point to nodes
    private int size;
    public SinglyLL() {
        this.size = 0;
    }

    //insert in linked list using recursion
    public void insertRev(int val, int index) {
        head = insertRev(val, index, head);
    }

    public Node insertRev(int val, int index, Node node) {
        if(index == 0) {
            Node temp = new Node(val, node);
            size++;
            return temp;
        }

        node.next = insertRev(val, index-1, node.next);
        return node;
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

        if(index == size - 1) {
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
        size--;
        System.out.println(val);
    }

    public void deleteFromEnd() {
        if(size <= 1) {
            deleteFromBeginning();
            return;
        }
        Node secondNode = get(size - 2);
        int val = tail.value;
        tail = secondNode;
        tail.next = null;
        size--;
        System.out.println(val);
    }

    public void deleteAtAnIndex(int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Invalid index " + index);
        }

        if(index == 0) {
            deleteFromBeginning();
            return;
        }

        if(index == size - 1) {
            deleteFromEnd();
            return;
        }

        Node prev = get(index - 1);
        int val = prev.next.value;
        prev.next = prev.next.next;

        System.out.println(val);
    }

    public Node find(int value) {
        Node node = head;
        while(node != null) {
            if(node.value == value)
                return node;
            node = node.next;
        }
        return null;
    }

    //function to return node object at a particular index
    public Node get(int index) {
        Node node = head;
        for(int i=0; i<index; i++) {
            node = node.next;
        }
        return node;
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
