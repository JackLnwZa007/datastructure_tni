public class NumberLinkedList {
    public static void main(String[] args) {
        LinkedList numbers = new LinkedList();

        // ข้อ 2) แอดข้อมูลเข้าตำแหน่ง index 0 เรื่อยๆ
        numbers.insert(0, 37);
        numbers.insert(0, 7);
        numbers.insert(0, 4);
        numbers.insert(0, 16);
        System.out.println("All elements = " + numbers.traversal());

        // ข้อ 3) แทรกเลข 20 ลงในตำแหน่งที่ 2
        numbers.insert(2, 20);
        System.out.println("Insert 20 to index 2 = " + numbers.traversal());

        // ข้อ 4) เติมเลข 25 ต่อท้ายรายการข้อมูล
        numbers.insert(25);
        System.out.println("Append 25 into list  = " + numbers.traversal());

        // ข้อ 5) ลบข้อมูลตัวแรกออก (ตำแหน่งที่ 0)
        numbers.remove(0);
        System.out.println("Deleted the first element = " + numbers.traversal());

        // ข้อ 6) ลบข้อมูลที่อยู่ในตำแหน่งที่ 2 ออก
        numbers.remove(2);
        System.out.println("Deleted element index 2   = " + numbers.traversal());

        // ข้อ 7) ลบข้อมูลตัวสุดท้ายออก
        numbers.removeLastElement();
        System.out.println("Deleted the last element  = " + numbers.traversal());
        System.out.println();

        // ข้อ 8) แสดงความยาวของลิสต์ข้อมูล
        System.out.println("Length of elements in List= " + numbers.length());

        // ข้อ 9) ดึงข้อมูลตำแหน่งที่ 1 ออกมาแสดง
        System.out.println("Element in index 1        = " + numbers.get(1));

        // ข้อ 10) เปลี่ยนข้อมูลตัวตำแหน่งที่ 1 ให้เป็น 100
        numbers.set(1, 100);
        System.out.println("Updated index 1 to 100    = " + numbers.traversal());

        // ข้อ 11) สั่งเคลียร์และทำความสะอาดลิสต์จนเป็นลิสต์ว่าง
        numbers.clear();
        System.out.println("Clear Linked List = " + numbers.traversal());
    }
}