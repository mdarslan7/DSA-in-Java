public class SegmentTree {
    class Node {
        int data;
        int leftInterval;
        int rightInterval;
        Node left;
        Node right;

        public Node(int leftInterval, int rightInterval) {
            this.leftInterval = leftInterval;
            this.rightInterval = rightInterval;
        }
    }

    Node root;

    public SegmentTree(int[] arr) {
        root = constructTree(arr, 0, arr.length - 1);
    }

    private Node constructTree(int[] arr, int start, int end) {
        if(start == end) {
            //leaf node
            Node leaf = new Node(start, end);
            leaf.data = arr[start];
            return leaf;
        }

        //create node with index you are at
        Node node = new Node(start, end);
        int mid = (start + end) / 2;

        node.left = constructTree(arr, start, mid);
        node.right = constructTree(arr, mid + 1, end);

        node.data = node.left.data + node.right.data;

        return node;
    }

    //Query function
    public int query(int qsi, int qei) {
        return query(this.root, qsi, qei);
    }

    private int query(Node node, int qsi, int qei) {
        if (node.leftInterval >= qsi && node.rightInterval <= qei) {
            //the node interval is completely inside the query interval
            return node.data;
        }
        else if (node.leftInterval > qei || node.rightInterval < qsi){
            //the node interval is completely outside the query interval
            return 0;
        }
        else {
            return this.query(node.left, qsi, qei) + this.query(node.right, qsi, qei);
        }
    }

    //Update function
    public void update(int index, int value) {
        this.root.data = update(this.root, index, value);
    }

    private int update(Node node, int index, int value) {
        if(index >= node.leftInterval && index <= node.rightInterval) {
            if(index == node.leftInterval && index == node.rightInterval) {
                node.data = value;
                return node.data;
            }
            else {
                int leftAns = update(node.left, index, value);
                int rightAns = update(node.right, index, value);
                node.data = leftAns + rightAns;
                return node.data;
            }
        }

        return node.data;
    }
}