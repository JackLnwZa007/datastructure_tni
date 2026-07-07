import java.util.ArrayList;
import java.util.Scanner;
public class Lab202 {    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    ArrayList<Integer> numbers = new ArrayList<>();

    int[] initial_numbers = {10, 11, 12, 13, 14, 15, 16, 17, 18, 19};

    // คัดลอกข้อมูลจากอาร์เรย์ไปยัง ArrayList
    for (int i = 0; i < initial_numbers.length; i++) {
        numbers.add(initial_numbers[i]);
    }

    System.out.println("Initial numbers : " + numbers);

    // เพิ่มข้อมูลท้าย
    System.out.print("Enter number to addท้าย : ");
    int value = sc.nextInt();
    numbers.add(value);

    System.out.println(numbers);

    // เพิ่มข้อมูลแทรก
    System.out.print("Enter number to insert : ");
    value = sc.nextInt();

    int lastDigit = 5;   // เปลี่ยนเป็นเลขหลักสุดท้ายของรหัสนักศึกษา
    numbers.add(lastDigit, value);

    System.out.println(numbers);

    // ลบข้อมูล
    numbers.remove(lastDigit);

    System.out.println("After remove :");
    System.out.println(numbers);

    // อัปเดตข้อมูล
    int beforeLastDigit = 2; // เปลี่ยนเป็นเลขก่อนสุดท้ายของรหัสนักศึกษา

    numbers.set(beforeLastDigit, 1); // เปลี่ยนเลข 1 เป็นวันที่เรียน

    System.out.println("Final numbers :");
    System.out.println(numbers);

    sc.close();
}
}
