public class BSTApp1 {
    static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        tree.sampleTree1();
        tree.printTree(tree.getRoot(), 0);

        System.out.println();
        System.out.println("--------------------MINIMUM NODE & MAXIMUM NODE--------------------");
        System.out.println("Minimum Node = " + tree.findMinimum());
        System.out.println("Maximum Node = " + tree.findMaximum(tree.getRoot()));

        System.out.println();
        System.out.println("--------------------PARENT NODE & DELETE NODE--------------------");
        int delNode = 60;
        tree.searchDeleteNode(delNode);
        System.out.println("Parent = " + tree.getParent().data);
        System.out.println("Delete Node = " + tree.getDeleteNode().data);

        System.out.println();
        System.out.println("--------------------HOMEWORK 4, 5, 9--------------------");
        int target = 40;
        System.out.println("Is " + target + " in BST => " + tree.findSpecificData(target));

        System.out.println();
        tree.deleteByLeftSubTree();
        tree.printTree(tree.getRoot(), 0);
    }
}
