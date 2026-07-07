public class Ex01 {  public static void main(String[] args) {

    int[] nums = {23, 67, 8, 91, 45, 12, 78};

    System.out.println("Array size = " + nums.length);
    System.out.println("First element = " + nums[0]);
    System.out.println("Last element = " + nums[nums.length - 1]);
    System.out.println("Middle element = " + nums[nums.length / 2]);

    System.out.print("All elements = ");

    for (int i = 0; i < nums.length; i++) {
        System.out.print(nums[i]);

        if (i != nums.length - 1) {
            System.out.print(", ");
        }
    }
}
}
