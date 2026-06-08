package com.firealgo.problemsolving.leetcode.leetcode75.binarytree;

import java.util.LinkedList;
import java.util.Queue;



public class BinaryTreeBFS {
    public void bfsTraversalRevise(TreeNode root) {
        if(root == null) return;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        System.out.print("\nBFS Traversal: ");
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            System.out.print(node.val + " ");
            if(node.left != null) queue.add(node.left);
            if(node.right != null) queue.add(node.right);
        }

    }
    public void bfsTraversal(TreeNode root) {
        if (root == null) return;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            TreeNode current = queue.poll();
            System.out.print(current.val + " "); // Process the node

            if (current.left != null) queue.add(current.left);
            if (current.right != null) queue.add(current.right);
        }
    }

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

        BinaryTreeBFS tree = new BinaryTreeBFS();
        System.out.print("BFS Traversal: ");
        tree.bfsTraversal(root);
        tree.bfsTraversalRevise(root);
    }
}