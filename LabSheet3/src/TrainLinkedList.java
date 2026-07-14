public class TrainLinkedList {
    public static void main(String[] args) {
        // สร้าง Object ของ Class LinkedList ชื่อ greenline
        LinkedList greenline = new LinkedList();

        // ลำดับที่ 1-3: เพิ่มสถานี หมอชิต, อารีย์, สนามเป้า
        greenline.insert("Mo-chit");
        greenline.insert("Ari");
        greenline.insert("Sanam-Pao");

        // ลำดับที่ 4: แสดงผลทั้งหมด
        System.out.println("All Stations : " + greenline.traversal());

        // ลำดับที่ 5: แทรกสถานี ราชครู (Rachakru) ระหว่าง อารีย์ กับ สนามเป้า (คือตําแหน่งที่ 2)
        greenline.insert(2, "Rachakru");

        // ลำดับที่ 6: แสดงผลทั้งหมด
        System.out.println("All Stations : " + greenline.traversal());

        // ลำดับที่ 7: แสดงจำนวนสถานีที่มีอยู่
        System.out.println("Total Station: " + greenline.length());

        // ลำดับที่ 8: แสดงชื่อสถานีแรกสุดในเส้นทาง (ตำแหน่ง index 0)
        System.out.println("First Station: " + greenline.get(0));

        // ลำดับที่ 9-10: เปลี่ยนชื่อ หมอชิต เป็น Mo-chit (Central Ladprao)
        greenline.set(0, "Mo-chit (Central Ladprao)");
        System.out.println("All Stations : " + greenline.traversal());

        // ลำดับที่ 11-12: ยกเลิกสถานีราชครู (สถานีราชครูย้ายไปอยู่ตำแหน่ง index 2)
        greenline.remove(2);
        System.out.println("All Stations : " + greenline.traversal());

        // ลำดับที่ 13-14: ยกเลิกสถานีปลายทาง (ตัวสุดท้ายออก)
        greenline.removeLastElement();
        System.out.println("All Stations : " + greenline.traversal());

        // ลำดับที่ 15-17: ยกเลิกสถานีในระบบรถไฟฟ้าสายสีเขียวทั้งหมด
        greenline.clear();
        System.out.println("Total Station: " + greenline.length());
        System.out.println("All Stations : " + greenline.traversal());
    }
}
