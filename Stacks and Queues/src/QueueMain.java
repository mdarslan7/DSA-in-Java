public class QueueMain {
    public static void main(String[] args) throws Exception {
        CustomQueue queue = new CustomQueue(5);

        queue.insert(12);
        queue.insert(65);
        queue.insert(76);
        queue.insert(32);

        queue.display();

        System.out.println(queue.remove());

        queue.display();
    }
}
