import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;
import java.util.Scanner;

public class LabQueue02 {

    public static boolean checkByDeque(String message) {
        Deque<Character> deque = new ArrayDeque<>();

        // เก็บตัวอักษรทีละตัวลง Deque
        for (char c : message.toCharArray()) {
            deque.addLast(c);
        }

        // ตรวจสอบตัวแรกและตัวสุดท้ายเข้าหาตรงกลาง
        while (deque.size() > 1) {
            char first = deque.pollFirst();
            char last = deque.pollLast();

            // เปรียบเทียบแบบไม่สนใจตัวพิมพ์เล็ก-ใหญ่ (Case-insensitive) ตามตัวอย่าง "Apa"
            if (Character.toLowerCase(first) != Character.toLowerCase(last)) {
                return false;
            }
        }
        return true;
    }

    public static boolean checkByStack(String message) {
        Queue<Character> queue = new ArrayDeque<>();
        Deque<Character> stack = new ArrayDeque<>(); // ใช้ Deque ทำหน้าที่เป็น Stack

        // เก็บตัวอักษรลงใน Queue และ Stack
        for (char c : message.toCharArray()) {
            queue.add(c);
            stack.push(c);
        }

        // ดึงออกมาเปรียบเทียบทีละคู่
        while (!queue.isEmpty()) {
            char fromQueue = queue.poll();
            char fromStack = stack.pop();

            if (Character.toLowerCase(fromQueue) != Character.toLowerCase(fromStack)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter some message: ");
        String message = sc.nextLine();

        System.out.println();
        System.out.println("Check Palindrome by Deque = " + (checkByDeque(message) ? "Palindrome" : "Not Palindrome"));
        System.out.println("Check Palindrome by Stack = " + (checkByStack(message) ? "Palindrome" : "Not Palindrome"));
    }
}