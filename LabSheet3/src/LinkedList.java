public class LinkedList {
    private Node head;

    // Constructor
    public LinkedList() {
        this.head = null;
    }

    // [ข้อ 1] Method traversal(): ดึงค่าข้อมูลทั้งหมดใน list มาแสดงผลในรูปแบบ [A, B, C]
    public String traversal() {
        if (head == null) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Node current = head;
        while (current != null) {
            sb.append(current.data);
            if (current.next != null) {
                sb.append(", ");
            }
            current = current.next;
        }
        sb.append("]");
        return sb.toString();
    }

    // [ข้อ 2 & 3] Method insert(position, value): แทรกข้อมูลตามตำแหน่งที่ต้องการ
    public void insert(int position, Object value) {
        Node newNode = new Node(value);

        // แทรกที่ตำแหน่งแรกสุด (index 0)
        if (position <= 0 || head == null) {
            newNode.next = head;
            head = newNode;
            return;
        }

        Node current = head;
        // เดินตัวชี้ไปหาก่อนตำแหน่งที่ต้องการแทรก 1 ก้าว
        for (int i = 0; i < position - 1; i++) {
            if (current.next == null) {
                break; // ป้องกันการหลุดขอบเขต ข้อมูลจะกลายเป็นเพิ่มต่อท้ายสุดแทน
            }
            current = current.next;
        }
        newNode.next = current.next;
        current.next = newNode;
    }

    // [ข้อ 4] Method insert(value): แทรกข้อมูลต่อไปเรื่อยๆ ที่ส่วนท้ายสุดของลิสต์ (Append)
    public void insert(Object value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    // [ข้อ 5 & 6] Method remove(position): ลบข้อมูล ณ ตำแหน่งที่กำหนด
    public void remove(int position) {
        if (head == null) {
            return;
        }
        // ลบตัวแรกสุด
        if (position <= 0) {
            head = head.next;
            return;
        }

        Node current = head;
        for (int i = 0; i < position - 1; i++) {
            if (current.next == null) {
                return; // เกินขนาดของลิสต์ ไม่ลบอะไรเลย
            }
            current = current.next;
        }

        if (current.next != null) {
            current.next = current.next.next;
        }
    }

    // [ข้อ 7] Method removeLastElement(): ลบข้อมูลตัวหลังสุดออก
    public void removeLastElement() {
        if (head == null) {
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }
        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
    }

    // [ข้อ 8] Method length(): นับจำนวนข้อมูลที่มีอยู่ทั้งหมดในลิสต์
    public int length() {
        int count = 0;
        Node current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    // [ข้อ 9] Method get(position): ดึงข้อมูลใน Node ตามตำแหน่งที่ระบุ
    public Object get(int position) {
        if (head == null || position < 0) {
            return null;
        }
        Node current = head;
        int index = 0;
        while (current != null) {
            if (index == position) {
                return current.data;
            }
            current = current.next;
            index++;
        }
        return null; // หาตำแหน่งไม่เจอ
    }

    // [ข้อ 10] Method set(position, value): อัปเดตเปลี่ยนค่าข้อมูลในตำแหน่งที่ต้องการ
    public void set(int position, Object value) {
        if (head == null || position < 0) {
            return;
        }
        Node current = head;
        int index = 0;
        while (current != null) {
            if (index == position) {
                current.data = value;
                return;
            }
            current = current.next;
            index++;
        }
    }

    // [ข้อ 11] Method clear(): ลบข้อมูลทั้งหมดที่มีอยู่ใน list
    public void clear() {
        head = null; // ในภาษา Java ค่าที่ค้างจะถูก GC ลบทิ้งอัตโนมัติเมื่อหัวลิสต์ขาดสาย
    }
}