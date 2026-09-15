public class TestApp {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        int[] nums= {11,9,23,87,38,22,92,10};

        Sorting sort = new Sorting(nums);
        sort.bubbleSort();
        sort.printSortedData();

        System.out.println();
        Sorting sort1 = new Sorting(nums);
        sort1.bubbleSort(true);
        sort1.printSortedData();

        //no2
        System.out.println();
        int[] num2= {25,11,45,6,87,20,78,64};
        Sorting sort2 = new Sorting(num2);
        sort.bubbleSort();
        sort.printSortedData();
        //No4
        System.out.println();
        int[] num4 = { 68, 10, 87, 75, 14, 36, 98, 76 };
        Sorting sort4 = new Sorting(num4);
        sort4.insertionSort();
        sort4.printSortedData();

        //no6
        System.out.println();
        int[] num6 = {87, 11, 26, 35, 49, 85, 21, 46};
        Sorting sort6 = new Sorting(num6);
        sort6.insertionSort();
        sort6.printSortedData();
    }

}