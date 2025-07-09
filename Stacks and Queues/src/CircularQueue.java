public class CircularQueue {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;
    int end = 0;
    int front = 0;
    int size = 0;
    public CircularQueue() {
        this(DEFAULT_SIZE);
    }
    public CircularQueue(int size) {
        this.data = new int[size];
    }

    public boolean isFull() {
        return size == data.length;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean insert(int item) {
        if(isFull())
            return false;

        data[end++] = item;
        end = end % data.length;
        size++;
        return true;
    }

    public int remove() throws Exception {
        if(isEmpty())
            throw new Exception("Cannot remove from an empty Queue!");

        int removed = data[front++];
        front = front % data.length;
        size--;
        return removed;
    }

    public int front() throws Exception {
        if(isEmpty())
            throw new Exception("Cannot remove from an empty Queue!");

        return data[front];
    }

    public void display() throws Exception {
        if(isEmpty())
            throw new Exception("Cannot remove from an empty Queue!");

        int i = front;
        do {
            System.out.print(data[i] + " -> ");
            i++;
            i %= data.length;
        } while(i != end);
        System.out.println("END");
    }
}