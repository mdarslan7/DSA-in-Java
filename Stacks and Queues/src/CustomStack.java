public class CustomStack {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;
    int ptr = -1;

    public CustomStack() {
        this(DEFAULT_SIZE);         //calling parameterized constructor
    }

    public CustomStack(int size) {
        this.data = new int[size];
    }

    public boolean isFull() {
        return ptr == data.length - 1;
    }

    public boolean isEmpty() {
        return ptr == -1;
    }

    public boolean push(int item) throws StackException {
        if(isFull())
            throw new StackException("Cannot push into a full stack");

        ptr += 1;
        data[ptr] = item;
        return true;
    }

    public int pop() throws StackException {
        if(isEmpty())
            throw new StackException("Cannot pop from an empty stack!");

        return data[ptr--];
    }

    public int peek() throws StackException {
        if(isEmpty())
            throw new StackException("Cannot peek an empty stack!");

        return data[ptr];
    }
}
