import java.util.ArrayDeque;
import java.util.Queue;

public class LabQueue01 {
    public static void main(String[] args) {
        // 1. สร้าง Queue<Integer> และเพิ่มข้อมูล 101-105 ด้วย loop
        Queue<Integer> queue = new ArrayDeque<>();
        for (int i = 101; i <= 105; i++) {
            queue.add(i);
            System.out.println("Enqueue: " + i);
        }
        System.out.println("Queue => " + queue);
        System.out.println();

        // 2. ทำงานซ้ำๆ จนกว่าคิวจะว่าง โดยใช้ isEmpty()
        while (!queue.isEmpty()) {
            // ดูหมายเลขถัดไป (ไม่ลบออกจากคิว) ใช้ peek()
            System.out.println("Calling number: " + queue.peek());

            // ประกาศเรียกคิวและลบออกจากคิว ใช้ poll()
            System.out.println("Providing service number: " + queue.poll());
            System.out.println();
        }

        System.out.println("Queue => " + queue);
    }
}
