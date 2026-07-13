import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] nums = new int[5];

        for (int i = 0; i < nums.length; i++) {
            System.out.print("Enter number index " + (i + 1) + ": ");
            nums[i] = scan.nextInt();
        }

        Array_controller numbers = new Array_controller();
        numbers.setNums(nums);
        numbers.display("All elements:");
    }
}