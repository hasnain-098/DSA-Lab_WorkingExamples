/*
 * Author   : Hasnain Memon
 * Date     : 14/12/2024
 */

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class CheckTypeOfBinaryTree {

    private Node root;
    private Scanner sc = null;

    static class Node {

        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    public void printPreOrder(Node node) {
        if (node == null) {
            return;
        }
        // first print data of node
        System.out.print(node.data + " ");

        // then recur on left subtree
        printPreOrder(node.left);

        // then recur on right subtree
        printPreOrder(node.right);
    }

    public void printInOrder(Node node) {
        if (node == null) {
            return;
        }

        // first recur on left subtree
        printInOrder(node.left);

        // then print data of node
        System.out.print(node.data + " ");

        // then recur on right subtree
        printInOrder(node.right);
    }

    public void printPostOrder(Node node) {
        if (node == null) {
            return;
        }

        // first recur on left subtree
        printPostOrder(node.left);

        // then recur on right subtree
        printPostOrder(node.right);

        // then print data of node
        System.out.print(node.data + " ");
    }

    // Task 2: Check whether a given tree is complete tree, full tree or both.
    public void checkTypeOfTree(Node root) {

        if (root == null) {
            System.out.println("Given tree is empty!");
            return;
        }

        boolean isFullTree = isFullTree(root);
        boolean isCompleteTree = isCompleteTree(root);

        if (isCompleteTree && isFullTree) {
            System.out.println("Given tree is Full Tree as well as Complete Tree");
        } else if (isFullTree) {
            System.out.println("Given tree is Full Tree");
        } else if (isCompleteTree) {
            System.out.println("Given tree is Complete Tree");
        }
    }
    public boolean isFullTree(Node root) {

        if (root == null) {
            return true;
        }

        if ((root.left != null && root.right == null) || (root.right != null && root.left == null)) {
            return false;
        }

        return isFullTree(root.left) && isFullTree(root.right);
    }
    public boolean isCompleteTree(Node root) {
        if (root == null) {
            return true;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        boolean gotNull = false;
        while (!queue.isEmpty()) {
            Node current = queue.poll();
            if (current == null) {
                gotNull = true;
            } else {
                if (gotNull) {
                    return false;
                }
                queue.add(current.left);
                queue.add(current.right);
            }
        }

        return true;
    }

    public static void main(String[] args) {

        CheckTypeOfBinaryTree bt = new CheckTypeOfBinaryTree();
        bt.root = new Node(5);
        bt.root.left = new Node(4);
        bt.root.right = new Node(11);
        bt.root.left.left = new Node(2);
        bt.root.left.right = new Node(9);

        System.out.print("Pre-Order Traversal: ");
        bt.printPreOrder(bt.root);
        System.out.println();

        System.out.print("In-Order Traversal: ");
        bt.printInOrder(bt.root);
        System.out.println();

        System.out.print("Post-Order Traversal: ");
        bt.printPostOrder(bt.root);
        System.out.println();

        // Task 2
        bt.checkTypeOfTree(bt.root);
    }
}
