public class Main {
    public static void main(String[] args) {
        BST tree = new BST<>();

        tree.insert(4);
        tree.insert(10);
        tree.insert(7);
        tree.insert(5);
        tree.insert(1);
        tree.insert(3);
        tree.insert(2);
        tree.insert(6);
        tree.insert(9);
        tree.insert(8);

        System.out.println("in order");
        tree.inOrderPrint();
        System.out.println("print formatted tree");
        tree.printFormatted();
        System.out.println("print tree");
        tree.printTree();
        System.out.println("balance the tree");
        tree.balance();
        System.out.println("print tree");
        tree.printTree();
        System.out.println("print formatted tree");
        tree.printFormatted();


    }
}
