public class BinaryTree {
    private Object root;
    private BinaryTree left, right;

    public BinaryTree(Object root) {
        this.root = root;
    }

    public BinaryTree(Object root, BinaryTree left, BinaryTree right) {
        this(root);
        if (left != null)
            this.left = left;
        if (right != null)
            this.right = right;
    }

    public BinaryTree(BinaryTree that) {
        this.root = that.root;
        if (that.left != null)
            this.left = new BinaryTree(that.left);
        if (that.right != null)
            this.right = new BinaryTree(that.right);
    }

    public Object getRoot() {
        return this.root;
    }

    public BinaryTree getLeft() {
        return this.left;
    }

    public BinaryTree getRight() {
        return this.right;
    }

    public boolean isBST() {
        if (!(root instanceof Comparable<?>)) return false;
        @SuppressWarnings("unchecked")
        Comparable<Object> key = (Comparable<Object>) root;
        if (left != null) {
            if (!left.isBST())
                return false;
            if (key.compareTo(left.root) < 0)
                return false;
        }
        if (right != null) {
            if (!right.isBST())
                return false;
            if (key.compareTo(right.root) > 0)
                return false;
        }
        return true;
    }

    public Object setRoot(Object object) {
        Object oldRoot = this.root;
        this.root = object;
        return oldRoot;
    }

    public BinaryTree setLeft(BinaryTree tree) {
        BinaryTree oldLeft = this.left;
        this.left = tree;
        return oldLeft;
    }

    public BinaryTree setRight(BinaryTree tree) {
        BinaryTree oldRight = this.right;
        this.right = tree;
        return oldRight;
    }

    public String toString() {
        String s = "";
        if (left != null)
            s = left.toString();
        s += root + " ";
        if (right != null)
            s += right.toString();
        return s;
    }
}