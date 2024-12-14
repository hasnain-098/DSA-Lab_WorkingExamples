/*
 * Author   : Hasnain Memon
 * Date     : 14/12/2024
 */

import java.util.Scanner;

public class CheckChildrenSumPropertyOfBinaryTree {

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

    // Task 3: Check the children sum property in binary tree, i.e. for every node data values must be
    //equal to the sum of data values of left and right child
    public boolean checkChildrenSumProperty(Node root) {

        if ((root == null) || (root.left == null && root.right == null)) {
            return true;
        }

        int leftValue = (root.left != null)? root.left.data : 0;
        int rightValue = (root.right != null)? root.right.data : 0;

        if (root.data != leftValue + rightValue) {
            return false;
        }

        return checkChildrenSumProperty(root.left) && checkChildrenSumProperty(root.right);
    }

    public static void main(String[] args) {

        CheckChildrenSumPropertyOfBinaryTree bt = new CheckChildrenSumPropertyOfBinaryTree();
        bt.root = new Node(20);
        bt.root.left = new Node(10);
        bt.root.right = new Node(10);
        bt.root.left.left = new Node(5);
        bt.root.left.right = new Node(5);
        bt.root.right.left = new Node(5);
        bt.root.right.right = new Node(5);

        System.out.print("Pre-Order Traversal: ");
        bt.printPreOrder(bt.root);
        System.out.println();

        System.out.print("In-Order Traversal: ");
        bt.printInOrder(bt.root);
        System.out.println();

        System.out.print("Post-Order Traversal: ");
        bt.printPostOrder(bt.root);
        System.out.println();

        // Task 3
        System.out.println("Has tree Children Sum Property? " +
                ((bt.checkChildrenSumProperty(bt.root)? "Yes" : "No")));
    }
}
