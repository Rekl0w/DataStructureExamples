
package avltree;

public class AVLTree {

    private Node root;

    public void insert(double item) {
        this.root = insert(this.root, item);
    }

    private Node insert(Node node, double item) {

        if (node == null) {

            Node n = new Node(item);
            return n;

        }

        if (item > node.data) {

            node.right = insert(node.right, item);

        } else if (item < node.data) {

            node.left = insert(node.left, item);
        }

        node.height = Math.max(height(node.left), height(node.right)) + 1;

        int bf = bf(node);

        if (bf > 1 && item < node.left.data) {

            return rightRotate(node);

        }

        if (bf < -1 && item > node.right.data) {

            return leftRotate(node);

        }

        if (bf > 1 && item > node.left.data) {

            node.left = leftRotate(node.left);

            return rightRotate(node);

        }

        if (bf < -1 && item < node.right.data) {

            node.right = rightRotate(node.right);

            return leftRotate(node);

        }

        return node;

    }

    private int height(Node node) {

        if (node == null) {

            return 0;
        }

        return node.height;

    }

    private int bf(Node node) {

        if (node == null) {

            return 0;

        }

        return height(node.left) - height(node.right);
    }

    private Node rightRotate(Node c) {

        Node b = c.left;
        Node T3 = b.right;

        b.right = c;
        c.left = T3;

        c.height = Math.max(height(c.left), height(c.right)) + 1;
        b.height = Math.max(height(b.left), height(b.right)) + 1;

        return b;
    }

    private Node leftRotate(Node c) {

        Node b = c.right;
        Node T2 = b.left;

        b.left = c;
        c.right = T2;

        c.height = Math.max(height(c.left), height(c.right)) + 1;
        b.height = Math.max(height(b.left), height(b.right)) + 1;

        return b;
    }

    public void print() {
        print(this.root);
    }

    private void print(Node node) {

        if (node == null) {
            return;
        }

        String str = "";

        if (node.left == null) {
            str += ".";
        } else {
            str += node.left.data;
        }

        str += " => " + node.data + " <= ";

        if (node.right == null) {
            str += ".";
        } else {
            str += node.right.data;
        }

        System.out.println(str);

        print(node.left);
        print(node.right);

    }

}
