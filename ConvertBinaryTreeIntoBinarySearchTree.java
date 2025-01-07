import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ConvertBinaryTreeIntoBinarySearchTree {

    Node root;

    public ConvertBinaryTreeIntoBinarySearchTree(Node root) {
        this.root = root;
    }

    public ConvertBinaryTreeIntoBinarySearchTree() {
        root = null;
    }

    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    public static void printInOrder(Node root) {

        if (root == null) {
            return;
        }

        printInOrder(root.left);
        System.out.print(root.data + " ");
        printInOrder(root.right);

    }

    private static void storeValues(Node root, List<Integer> values) {

        if (root == null) {
            return;
        }

        storeValues(root.left, values);
        values.add(root.data);
        storeValues(root.right, values);
    }

    private static void rebuildTree(Node root, List<Integer> values, int[] index) {
        if (root == null) {
            return;
        }
        rebuildTree(root.left, values, index);
        root.data = values.get(index[0]);
        index[0]++;
        rebuildTree(root.right, values, index);
    }

    public static void convertToBinarySearchTree(Node root) {

        List<Integer> values = new ArrayList<>();

        storeValues(root, values);

        Collections.sort(values);

        int[] index = {0};
        rebuildTree(root, values, index);
    }

    public static void main(String[] args) {

        Node root = new Node(2);
        root.left = new Node(4);
        root.right = new Node(6);
        root.left.left = new Node(8);
        root.left.right = new Node(11);
        root.right.right = new Node(20);
        root.right.left = new Node(13);
        root.right.left.left = new Node(9);

        System.out.println("Binary Tree's InOrder Traversal");
        printInOrder(root);
        System.out.println();

        convertToBinarySearchTree(root);

        System.out.println("Binary Search Tree's InOrder Traversal");
        printInOrder(root);
        System.out.println();
    }
}
