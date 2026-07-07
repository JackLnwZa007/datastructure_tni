import java.util.Scanner;
public class Ex02 {    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int[] nums = new int[5];

    for (int i = 0; i < nums.length; i++) {
        System.out.print("Enter number index " + i + ": ");
        nums[i] = sc.nextInt();
    }

    System.out.println("\nDisplay all numbers:");

    for (int i = 0; i < nums.length; i++) {
        System.out.print(nums[i]);

        if (i != nums.length - 1) {
            System.out.print(", ");
        }
    }

    sc.close();
}
}
