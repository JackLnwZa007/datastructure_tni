public class Ex07 {public static void main(String[] args) {

    int[] nums = {23, 67, 8, 91, 45, 12, 78};

    System.out.println("Display an initial dataset:");
    for (int i = 0; i < nums.length; i++) {
        System.out.print(nums[i] + " ");
    }

    System.out.println("\n\nDeleted the first element:");

    for (int i = 1; i < nums.length; i++) {
        System.out.print(nums[i] + " ");
    }
}
}
