public class NumberLinkList {
    static void main(String[] args) {
        LinkList numbers = new LinkList();

        numbers.insert(0,37);
        numbers.insert(0,7);
        numbers.insert(0,4);
        numbers.insert(0,16);
        System.out.println(numbers.traversel());

        numbers.insert(2,20);
        System.out.println(numbers.traversel());

        numbers.insert(25);
        System.out.println(numbers.traversel());

        numbers.remove(0);
        System.out.println(numbers.traversel());

        numbers.remove(2);
        System.out.println(numbers.traversel());

        numbers.removeLastElement();
        System.out.println(numbers.traversel());

        System.out.println("\nLength of elements in List = " + numbers.length());

        System.out.println("Element in index 1 = " + numbers.get(1));

        numbers.set(1, 100);
        System.out.println("Update index 1 to 100 = " + numbers.traversel());

        numbers.clear();
        System.out.println("Clear Linked List = " + numbers.traversel());
    }
}
