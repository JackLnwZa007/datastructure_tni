public class Ex06 {   public static void main(String[] args) {

    int[] nums = {23, 67, 8, 91, 45, 12, 78};

    System.out.println("Display an initial dataset:");
    for (int i = 0; i < nums.length; i++) {
        System.out.print(nums[i] + " ");
    }

    System.out.println("\n\nDeleted data index 2:");

    for (int i = 0; i < nums.length; i++) {
        if (i != 2) {
            System.out.print(nums[i] + " ");
        }
    }
}
}
