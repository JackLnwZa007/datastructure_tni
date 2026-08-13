import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class QueueRotate {

    public static void rotateQueue(Queue<String> queue) {

        String first = queue.poll();

        queue.offer(first);
    }

    public static void displayQueue(Queue<String> queue) {

        System.out.print("Queue => ");

        for (String item : queue) {
            System.out.print(item + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<>();

        queue.offer("A");
        queue.offer("B");
        queue.offer("C");
        queue.offer("D");
        queue.offer("E");

        Scanner sc = new Scanner(System.in);

        int choice;

        do {

            displayQueue(queue);

            System.out.print("Rotate Queue? (1=Yes, Other=Exit) : ");
            choice = sc.nextInt();

            if (choice == 1) {
                rotateQueue(queue);
                System.out.println();
            }

        } while (choice == 1);

        System.out.println();
        System.out.println("Program End.");
        sc.close();
    }
}