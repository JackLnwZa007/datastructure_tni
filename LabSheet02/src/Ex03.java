public class Ex03 {    public static void main(String[] args) {

    int[] nums = {23, 67, 8, 91, 45, 12, 78};

    System.out.println("Display an initial dataset:");
    for (int i = 0; i < nums.length; i++) {
        System.out.print(nums[i] + " ");
    }

    int[] copy_numbers = new int[nums.length + 1];

    for (int i = 0; i < nums.length; i++) {
        copy_numbers[i] = nums[i];
    }

    System.out.println("\n\nDisplay element in 'copy_numbers':");
    for (int i = 0; i < copy_numbers.length; i++) {
        System.out.print(copy_numbers[i] + " ");
    }

    copy_numbers[copy_numbers.length - 1] = 15;

    System.out.println("\n\nAfter adding new_element:");
    for (int i = 0; i < copy_numbers.length; i++) {
        System.out.print(copy_numbers[i] + " ");
    }
}
}
