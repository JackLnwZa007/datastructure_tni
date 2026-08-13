public class SinglyLinkedList {

    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head;

    public SinglyLinkedList() {
        head = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void append(int value) {

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

    public Object get(int position) {

        if (position < 0)
            return null;

        Node current = head;
        int index = 0;

        while (current != null) {

            if (index == position) {
                return current.data;
            }

            current = current.next;
            index++;
        }

        return null;
    }

    public void set(int position, int value) {

        if (position < 0) {
            System.out.println("Updated data fail...");
            return;
        }

        Node current = head;
        int index = 0;

        while (current != null) {

            if (index == position) {
                current.data = value;
                System.out.println("Updated data success!!");
                return;
            }

            current = current.next;
            index++;
        }

        System.out.println("Updated data fail...");
    }

    public boolean contains(int value) {

        Node current = head;

        while (current != null) {

            if (current.data == value)
                return true;

            current = current.next;
        }

        return false;
    }

    public void addAll(SinglyLinkedList otherList) {

        if (otherList == null || otherList.head == null)
            return;

        if (head == null) {
            head = otherList.head;
            return;
        }

        Node current = head;

        while (current.next != null) {
            current = current.next;
        }

        current.next = otherList.head;
    }

    public void print() {

        Node current = head;

        System.out.print("[");

        while (current != null) {

            System.out.print(current.data);

            if (current.next != null)
                System.out.print(", ");

            current = current.next;
        }

        System.out.println("]");
    }
}