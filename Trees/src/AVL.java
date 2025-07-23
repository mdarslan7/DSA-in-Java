public class AVL {
    private Node root;

    public int height() {
        return height(root);
    }

    public int height(Node node) {
        if(node != null)
            return node.height;

        return -1;
    }

    public boolean isEmpty(Node node) {
        return node == null;
    }

    public void display() {
        display(root, "Root Node: ");
    }

    private void display(Node node, String details) {
        if(node == null)
            return;

        System.out.println(details + node.getValue());
        display(node.left, "Left child of " + node.getValue() + " : ");
        display(node.right, "Right child of " + node.getValue() + " : ");
    }

    public void insert(int value) {
        root = insert(value, root);
    }

    private Node insert(int value, Node node) {
        if(node == null) {
            node = new Node(value);
            return node;
        }

        if(value < node.value) {
            node.left = insert(value, node.left);
        }

        if(value > node.value) {
            node.right = insert(value, node.right);
        }

        node.height = Math.max(height(node.left), height(node.right) + 1);

        return rotate(node);
    }

    private Node rotate(Node node) {
        if((height(node.left) - height(node.right)) > 1) {
            //left-heavy
            if((height(node.left.left) - height(node.left.right)) > 0) {
                //left-left case
                return rightRotate(node);
            }

            if((height(node.left.left) - height(node.left.right)) < 0) {
                //left-right case
                node.left = leftRotate(node.left);
                return rightRotate(node);
            }
        }

        if((height(node.left) - height(node.right)) < -1) {
            //right-heavy
            if((height(node.right.left) - height(node.right.right)) < 0) {
                //right-right case
                return leftRotate(node);
            }

            if((height(node.right.left) - height(node.right.right)) > 0) {
                //right-left case
                node.left = rightRotate(node.left);
                return leftRotate(node);
            }
        }

        //if neither of the conditions match, just return the node
        return node;
    }

    public Node rightRotate(Node p) {
        Node c = p.left;
        Node t = c.right;

        c.right = p;
        p.left = t;

        //update heights
        p.height = Math.max(height(p.left), height(p.right)) + 1;
        c.height = Math.max(height(c.left), height(c.right))+ 1;

        return c;
    }

    public Node leftRotate(Node c) {
        Node p = c.right;
        Node t = p.left;

        p.left = c;
        c.right = t;

        //update heights
        c.height = Math.max(height(c.left), height(c.right)) + 1;
        p.height = Math.max(height(p.left), height(p.right)) + 1;

        return p;
    }

    public boolean balanced() {
        return balanced(root);
    }

    private boolean balanced(Node node) {
        if(node == null) {
            return true;
        }

        return Math.abs(height(node.left) - height(node.right)) <= 1 && balanced(node.left) && balanced(node.right);
    }

    public void populate(int[] nums) {
        for(int num: nums) {
            insert(num);
        }
    }

    public void preOrder() {
        preOrder(root);
    }

    private void preOrder(Node node) {
        if(node == null)
            return;

        System.out.print(node.value + " ");
        preOrder(node.left);
        preOrder(node.right);
    }

    public void inOrder() {
        inOrder(root);
    }

    private void inOrder(Node node) {
        if(node == null)
            return;

        inOrder(node.left);
        System.out.print(node.value + " ");
        inOrder(node.right);
    }

    public void postOrder() {
        postOrder(root);
    }

    private void postOrder(Node node) {
        if(node == null)
            return;

        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.value + " ");
    }

    public class Node {
        private int value;
        private Node left;
        private Node right;
        private int height;

        public Node(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }
}