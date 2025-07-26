package com.firealgo.codingproblemsolvinginjava.leetcode.leetcode75.binarytree;

// Definition for a binary tree node.
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
        left = null;
        right = null;
    }
}

public class MaxDepthBinaryTree104 {
    public static void main(String[] args) {
        // Creating a sample binary tree:
        //        3
        //       / \
        //      9   20
        //         /  \
        //        15   7

        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        // Creating an instance of Solution class

        // Finding the maximum depth
        int depth = maxDepth(root);

        // Printing the result
        System.out.println("Maximum Depth of Binary Tree: " + depth);
    }

    public static int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }
}
