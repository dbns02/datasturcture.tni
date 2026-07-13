public class Ex01 {
    public static void main(String[] args) {
        int[] nums = { 23, 67, 8, 91, 45, 12, 78};

        System.out.println("Length = " + nums.length);
        System.out.println("The first element = " + nums[0]);
        System.out.println("The last element = " + nums[nums.length-1]);
        System.out.println("The middle element = " + nums[nums.length/2]);

        System.out.println();
        System.out.println("Display all elements: ");

        boolean first_element = true;

//        Normal :
//        for ( int i = 0; i < nums.length; i++) {
//            if (!first_element) { or first_element = false
//                System.out.print(", ");
//            }
//            System.out.print(nums[i]);
//            first_element = false;
//        }

        for (int num: nums) {
            System.out.print((!first_element? ", " : "") + num); // condition
            first_element = false;
        }
    }
}