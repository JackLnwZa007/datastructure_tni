public class SinglyApp {

    static SinglyLinkedList list1 = new SinglyLinkedList();
    static SinglyLinkedList list2 = new SinglyLinkedList();

    public static void testAppend() {

        System.out.println("Test method 'append()'");
        System.out.println("----------------------");

        for (int i = 101; i <= 105; i++) {
            list1.append(i);
        }

        System.out.print("Current List => ");
        list1.print();

        System.out.println();
    }

    public static void testGet() {

        System.out.println("Test method 'get()'");
        System.out.println("-------------------");

        int i = 2;
        int j = 7;

        Object data1 = list1.get(i);

        if (data1 != null)
            System.out.println("Get element index " + i + " = " + data1);
        else
            System.out.println("Get element index " + i + " = No data");

        Object data2 = list1.get(j);

        if (data2 != null)
            System.out.println("Get element index " + j + " = " + data2);
        else
            System.out.println("Get element index " + j + " = No data");

        System.out.println();
    }

    public static void testSet() {

        System.out.println("Test method 'set()'");
        System.out.println("-------------------");

        list1.set(2, 111);
        System.out.print("Current List => ");
        list1.print();

        list1.set(7, 222);
        System.out.print("Current List => ");
        list1.print();

        System.out.println();
    }

    public static void testContains() {

        System.out.println("Test method 'contains()'");
        System.out.println("------------------------");

        int find1 = 104;
        int find2 = 222;

        if (list1.contains(find1))
            System.out.println(find1 + " found!!");
        else
            System.out.println(find1 + " not found...");

        if (list1.contains(find2))
            System.out.println(find2 + " found!!");
        else
            System.out.println(find2 + " not found...");

        System.out.println();
    }

    public static void testAddAll() {

        System.out.println("Test method 'addAll()'");
        System.out.println("----------------------");

        // ---------- กรณี list2 ว่าง ----------
        System.out.print("Elements in list1 => ");
        list1.print();

        System.out.print("Elements in list2 => ");
        list2.print();

        list1.addAll(list2);

        System.out.print("Merge result => ");
        list1.print();

        System.out.println();

        for (int i = 201; i <= 205; i++) {
            list2.append(i);
        }

        System.out.print("Elements in list1 => ");
        list1.print();

        System.out.print("Elements in list2 => ");
        list2.print();

        list1.addAll(list2);

        System.out.print("Merge result => ");
        list1.print();

        System.out.println();

        SinglyLinkedList list3 = new SinglyLinkedList();

        list3.addAll(list2);

        System.out.print("Elements in list3 => ");
        list3.print();

        System.out.println();
    }

    public static void main(String[] args) {

        testAppend();

        testGet();

        testSet();

        testContains();

        testAddAll();
    }
}
