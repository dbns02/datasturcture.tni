public class QueueTest {
    static void main() {
        QueueLinkedList q = new QueueLinkedList();
        //QueueArrayBased q = new QueueArrayBased();

        q.enqueue(10);
        q.enqueue(11);
        q.enqueue(12);

        System.out.println(q.peek());

        System.out.println(q.dequeue());
        System.out.println(q.peek());
    }
}