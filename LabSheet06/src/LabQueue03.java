import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class LabQueue03 {

    public static void reverse(Queue<Integer> queue) {
        Deque<Integer> stack = new ArrayDeque<>();

        // 1. ดึงข้อมูลจาก Queue ใส่ Stack
        while (!queue.isEmpty()) {
            stack.push(queue.poll());
        }

        // 2. ดึงข้อมูลจาก Stack กลับมาใส่ Queue เดิม
        while (!stack.isEmpty()) {
            queue.add(stack.pop());
        }
    }

    public static void main(String[] args) {
        Queue<Integer> queue = new ArrayDeque<>();

        // เพิ่มข้อมูลเริ่มต้น [10, 20, 30, 40, 50]
        for (int i = 10; i <= 50; i += 10) {
            queue.add(i);
        }

        System.out.println("Before reverse => " + queue);
        reverse(queue);
        System.out.println("After  reverse => " + queue);
    }
}
