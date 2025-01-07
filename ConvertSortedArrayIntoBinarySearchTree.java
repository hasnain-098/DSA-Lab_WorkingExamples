public class ConvertSortedArrayIntoBinarySearchTree {

    Node root;

    public ConvertSortedArrayIntoBinarySearchTree(Node root) {
        this.root = root;
    }

    public ConvertSortedArrayIntoBinarySearchTree() {
        root = null;
    }

    static class Node {
        int data;
        Node left, right;

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

    public static Node convertToBinarySearchTree(int[] array, int start, int end) {

        if (start > end) {
            return null;
        }

        int mid = start + (end - start) / 2;
        Node root = new Node(array[mid]);

        root.left = convertToBinarySearchTree(array, start, mid - 1);
        root.right = convertToBinarySearchTree(array, mid + 1, end);

        return root;
    }

    public static void main(String[] args) {

        int[] array = {0, 2, 7, 9, 11, 13, 14};

        Node root = convertToBinarySearchTree(array, 0, array.length - 1);

        printInOrder(root);
    }
}
