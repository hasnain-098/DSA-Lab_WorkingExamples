/*
 * Author   : Hasnain Memon
 * Date     : 14/12/2024
 */

import java.util.Scanner;

public class CalculateLevelOfBinaryTree {

    private Node root;

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

    // Task 1: Calculate level of the binary tree.
    public int calculateLevel(Node root) {

        if (root == null) {
            return 0;
        }

        return Math.max(calculateLevel(root.left), calculateLevel(root.right)) + 1;
    }

    public static void main(String[] args) {

        CalculateLevelOfBinaryTree bt = new CalculateLevelOfBinaryTree();
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

        // Task 1
        System.out.println("Level: " + bt.calculateLevel(bt.root));
    }
}
