class Node {
    int key, height;
    Node left, right;

    public Node(int key) {
        this.key = key;
        height = 1;
        left = right = null;
    }
}

public class DeletionInAVLTree {

    Node root;

    int height(Node root) {
        if (root == null) {
            return 0;
        }

        return root.height;
    }

    int max(int a, int b) {
        return (a > b)? a : b;
    }

    // method to right rotate subtree rooted with y
    Node rightRotate(Node y) {
        Node x = y.left;
        Node t2 = x.right;

        // perform rotation
        x.right = y;
        y.left = t2;

        // update heights
        y.height = max(height(y.left), height(y.right)) + 1;
        x.height = max(height(x.left), height(x.right)) + 1;

        return x; // return new root
    }

    // method to right rotate subtree rooted with x
    Node leftRotate(Node x) {
        Node y = x.right;
        Node t2 = y.left;

        // perform rotation
        y.left = x;
        x.right = t2;

        // update heights
        x.height = max(height(x.left), height(x.right)) + 1;
        y.height = max(height(y.left), height(y.right)) + 1;

        return y; // return new root
    }

    int getBalance(Node root) {
        if (root == null) {
            return 0;
        }
        return height(root.left) - height(root.right);
    }

    Node insert(Node root, int key) {
        if (root == null) {
            return new Node(key);
        }
        if (key < root.key) {
            root.left = insert(root.left, key);
        } else if (key > root.key) {
            root.right = insert(root.right, key);
        } else {
            return root;
        }

        root.height = 1 + max(height(root.left), height(root.right));

        int balance = getBalance(root);

        if (balance > 1 && key < root.left.key) {
            return rightRotate(root);
        }
        if (balance < -1 && key > root.right.key) {
            return leftRotate(root);
        }
        if (balance > 1 && key > root.left.key) {
            root.left = leftRotate(root.left);
            return rightRotate(root);
        }
        if (balance < -1 && key < root.right.key) {
            root.right = rightRotate(root.right);
            return leftRotate(root);
        }

        return root;
    }

    void printInOrder(Node root) {
        if (root == null) {
            return;
        }

        printInOrder(root.left);
        System.out.print(root.key + " ");
        printInOrder(root.right);
    }

    // This method performs deletion in AVL Tree. First it deletes the node then balances the tree.
    public Node delete(Node root, int key) {
        // Base case: if tree is empty
        if (root == null) {
            return root;
        }
        // Otherwise recur down the tree
        if (key < root.key) {
            root.left = delete(root.left, key);
        } else if (key > root.key) {
            root.right = delete(root.right, key);
            // if key is same as root's key, then this is the root to be deleted
        } else {
            // root with only one child or no child
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            // root with two children: Get the inorder successor (smallest in the right subtree)
            root.key = minValue(root.right);

            // delete the inorder successor
            root.right = delete(root.right, root.key);

            root.height = 1 + max(height(root.left), height(root.right));

            int balance = getBalance(root);

            if (balance > 1 && key < root.left.key) {
                return rightRotate(root);
            }
            if (balance < -1 && key > root.right.key) {
                return leftRotate(root);
            }
            if (balance > 1 && key > root.left.key) {
                root.left = leftRotate(root.left);
                return rightRotate(root);
            }
            if (balance < -1 && key < root.right.key) {
                root.right = rightRotate(root.right);
                return leftRotate(root);
            }
        }
        return root;
    }

    private int minValue(Node root) {
        int min = root.key;
        // We are traversing in left becasue in BST, left contain smaller values
        while (root.left != null) {
            min = root.left.key;
            root = root.left;
        }
        return min;
    }

    public static void main(String[] args) {

        DeletionInAVLTree tree = new DeletionInAVLTree();

        tree.root = tree.insert(tree.root, 10);
        tree.root = tree.insert(tree.root, 20);
        tree.root = tree.insert(tree.root, 30);
        tree.root = tree.insert(tree.root, 40);
        tree.root = tree.insert(tree.root, 50);
        tree.root = tree.insert(tree.root, 25);

        System.out.println("InOrder traversal of constructed tree: ");
        tree.printInOrder(tree.root);

        Node deletedNode = tree.delete(tree.root, 20);
        System.out.println(deletedNode.key + " is deleted");

        System.out.println("InOrder traversal of constructed tree after deletion: ");
        tree.printInOrder(tree.root);

    }
}
