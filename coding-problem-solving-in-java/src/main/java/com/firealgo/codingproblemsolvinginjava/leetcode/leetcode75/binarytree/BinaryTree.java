package com.firealgo.codingproblemsolvinginjava.leetcode.leetcode75.binarytree;

public class BinaryTree {

    // Nested TreeNode class
    private static class TreeNode {
        private int val;
        private TreeNode left, right;

        // Constructor
        public TreeNode(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }

        // Getter and Setter methods
        public int getVal() {
            return val;
        }

        public void setVal(int val) {
            this.val = val;
        }

        public TreeNode getLeft() {
            return left;
        }

        public void setLeft(TreeNode left) {
            this.left = left;
        }

        public TreeNode getRight() {
            return right;
        }

        public void setRight(TreeNode right) {
            this.right = right;
        }
    }

    private TreeNode root;

    public BinaryTree() {
        this.root = null;
    }

    // Getter & Setter for root
    public TreeNode getRoot() {
        return root;
    }

    public void setRoot(TreeNode root) {
        this.root = root;
    }

    // In-Order Traversal (Left -> Root -> Right)
    public void inOrderTraversal(TreeNode node) {
        if (node != null) {
            inOrderTraversal(node.getLeft());
            System.out.print(node.getVal() + " ");
            inOrderTraversal(node.getRight());
        }
    }

    public void displayTree() {
        System.out.print("In-Order Traversal: ");
        inOrderTraversal(root);
        System.out.println();
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        // Manually setting up a non-BST tree structure
        TreeNode root = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(5);

        root.setLeft(node2);
        root.setRight(node3);
        node2.setLeft(node4);
        node3.setRight(node5);

        // Assigning root to the tree
        tree.setRoot(root);

        // Display the tree using In-Order Traversal
        tree.displayTree();
    }
}

