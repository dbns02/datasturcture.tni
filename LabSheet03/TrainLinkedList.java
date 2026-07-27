import java.util.LinkedList;

public class TrainLinkedList {

    public static void main(String[] args) {
        LinkList greenline = new LinkList();

        greenline.insert("Mo-chit");
        greenline.insert("Ari");
        greenline.insert("Sanam-Pao");
        System.out.println("All Stations : " + greenline.traversel());

        greenline.insert(2, "Rachakru");
        System.out.println("All Stations : " + greenline.traversel());

        System.out.println("Total Station: " + greenline.length());

        System.out.println("First Station: " + greenline.get(0));

        greenline.set(0, "Mo-chit (Central Ladprao)");
        System.out.println("All Stations : " + greenline.traversel());

        greenline.remove(2);
        System.out.println("All Stations : " + greenline.traversel());

        greenline.removeLastElement();
        System.out.println("All Stations : " + greenline.traversel());

        greenline.clear();
        System.out.println("Total Station: " + greenline.length());
        System.out.println("All Stations : " + greenline.traversel());
    }

}