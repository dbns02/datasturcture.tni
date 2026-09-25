public class TestApp {
    static void main(String[] args) {
        System.out.println("Bubble Sort");
        int[] nums = {11, 9, 23, 87, 38, 22, 92, 10};

        Sorting sort1 = new Sorting(nums);
        sort1.bubbleSort();
        sort1.printSortedDate();
        System.out.println("------------------------------------------------");

        System.out.println();
        System.out.println("Selection Sort");
        int[] nums2 = {25, 11, 45, 6, 87, 20, 78, 64};

        Sorting sort2 = new Sorting(nums2);
        sort2.selectionSort();
        sort2.printSortedDate();
        System.out.println("------------------------------------------------");

        System.out.println();
        System.out.println("Insertion Sort");
        int[] nums3 = {68, 10, 87, 75, 14, 36, 98, 76};

        Sorting sort3 = new Sorting(nums3);
        sort3.insertionSort();
        sort3.printSortedDate();
        System.out.println("------------------------------------------------");

        System.out.println();
        System.out.println("Quick Sort");
        int[] nums4 = {87, 11, 26, 35, 49, 85, 21, 46};

        Sorting sort4 = new Sorting(nums4);
        sort4.quickSort();
        sort4.printSortedDate();
        System.out.println("------------------------------------------------");
    }
}
