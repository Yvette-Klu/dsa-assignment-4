import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        int queue_size = 10;
        ArrayBasedQueue<Integer> queue = new ArrayBasedQueue<>(queue_size);
        print(queue);

        // populate queue with random integers between 0 and 10 (inclusive)
        int[] added_elements = new int[12];
        for (int i = 0; i < 12; i++) {
            int element = (int) (Math.random() * 11);
            added_elements[i] = element;
            queue.enqueue(element);
        }

        print(queue);

        // print("Order of addition " + Arrays.toString(added_elements));

        // repetitive removal
        int[] removed = new int[queue.getSize()];
        for (int i = 0; i < queue_size; i++) {
            int element = queue.dequeue();
            removed[i] = element;
        }
        print("removed element" + Arrays.toString(removed));

        /**
         * Print the elements of the queue in the right order i.e. the head first, and
         * the tail last. In your codes to demonstrate your solution, ensure that the
         * head of the queue is in the middle of the array backing the queue.
         */
        // Put your codes here

        int queue_size1 = 10;
        ArrayBasedQueue<Integer> queue1 = new ArrayBasedQueue<>(queue_size1);
        print(queue);
        queue1.enqueue(5);
        queue1.enqueue(3);
        queue1.enqueue(2);
        queue1.enqueue(139);
        queue1.enqueue(45);
        queue1.enqueue(39);
        queue1.enqueue(16);
        queue1.enqueue(12);
        queue1.enqueue(6);
        queue1.enqueue(11);

        print(queue1);

        queue1.dequeue();
        print("queue after first dequeue = " + queue1);

        queue1.dequeue();
        print("queue after second dequeue = " + queue1);
        queue1.enqueue(910);
        queue1.enqueue(120);

        print(" final " + queue1);
    }

    public static void print(Object o) {
        System.out.println(o.toString());
    }
}
