public class RepresentExpressionUsingBinaryTree {

    Node root;

    public RepresentExpressionUsingBinaryTree(Node root) {
        this.root = root;
    }

    public RepresentExpressionUsingBinaryTree() {
        root = null;
    }

    static class Node {
        String data;
        Node left, right;

        public Node(String data) {
            this.data = data;
            left = right = null;
        }
    }

    public void printInOrder(Node root) {

        if (root == null) {
            return;
        }

        printInOrder(root.left);
        System.out.print(root.data + " ");
        printInOrder(root.right);

    }

    public static void main(String[] args) {

        RepresentExpressionUsingBinaryTree expressionTree = new RepresentExpressionUsingBinaryTree();
        Node divide = new Node("/");
        Node multiply = new Node("*");
        Node plus1 = new Node("+");
        Node minus = new Node("-");
        Node plus2 = new Node("+");
        Node five = new Node("5");
        Node two1 = new Node("2");
        Node two2 = new Node("2");
        Node one = new Node("1");
        Node two3 = new Node("2");
        Node nine = new Node("9");

        expressionTree.root = divide;
        divide.left = multiply;
        divide.right = plus1;

        multiply.left = plus2;
        multiply.right = minus;

        plus2.left = five;
        plus2.right = two1;

        minus.left = two2;
        minus.right = one;

        plus1.left = two3;
        plus1.right = nine;

        System.out.println("InOrder Traversal: ");
        expressionTree.printInOrder(expressionTree.root);
        System.out.println();
    }
}
