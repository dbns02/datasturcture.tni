import java.util.ArrayList;
import java.util.Scanner;

public class Lab202 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        int[] initial_numbers = {10, 11, 12, 13, 14, 15, 16, 17, 18, 19};

        for (int num : initial_numbers) {
            numbers.add(num);
        }

//        Total
        System.out.println("Initial numbers = " + numbers);

//        Add Last Number
        System.out.print("\nEnter a number to add at the end: ");
        int add_last = sc.nextInt();
        numbers.add(add_last);
        System.out.println("After added to the end = " + numbers);

//        Insert Number at Index 2513510061 ==> 1
        System.out.print("\nEnter a number to insert at index 3: ");
        int add_insert = sc.nextInt();
        int insert_index = 1;
        numbers.add(insert_index, add_insert);
        System.out.println("After inserted at index " + insert_index + " = " + numbers);

//        Remove Number at Index 2513510061 ==> 6
        int delete_index = 6;
        numbers.remove(delete_index);
        System.out.println("\nAfter deleted index " + delete_index + " = " + numbers);

//        UpDate Number at Index 2513510061 ==> 0
        int update_index = 0;
        int date = 10;
        numbers.set(update_index, date);
        System.out.println("After updated index " + update_index + " with today's date = " + numbers);

//        Total
        System.out.println("\nFinal numbers = " + numbers);
    }

}