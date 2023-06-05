public class Main {

    public static void main(String[] args) {
        BinaryTree treeB = new BinaryTree("B");
        System.out.println("treeB: " + treeB);
        System.out.println("treeB.isBST(): " + treeB.isBST());
        BinaryTree treeC = new BinaryTree("C");
        BinaryTree treeA = new BinaryTree("A", treeB, treeC);
        System.out.println("treeA: " + treeA);
        System.out.println("treeA.isBST(): " + treeA.isBST());
    }
}