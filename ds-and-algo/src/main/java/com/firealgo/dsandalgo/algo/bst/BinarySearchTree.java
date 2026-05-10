package com.firealgo.dsandalgo.algo.bst;

import java.util.*;

/**
 * Binary Search Tree (BST)
 *
 * Core Operations:
 * - Insert
 * - Search
 * - Delete
 * - Traversals (Inorder, Preorder, Postorder)
 * - Height
 * - Min / Max
 *
 * BST Property:
 * Left < Root < Right
 */
public class BinarySearchTree {

    private Node root;

    /* ================= INSERT ================= */

    public void insert(int key) {
        root = insertRec(root, key);
    }

    private Node insertRec(Node node, int key) {
        if (node == null) return new Node(key);

        if (key < node.key) {
            node.left = insertRec(node.left, key);
        } else if (key > node.key) {
            node.right = insertRec(node.right, key);
        }
        // duplicates ignored

        return node;
    }

    /* ================= SEARCH ================= */

    public boolean search(int key) {
        return searchRec(root, key);
    }

    private boolean searchRec(Node node, int key) {
        if (node == null) return false;

        if (key == node.key) return true;

        return key < node.key
                ? searchRec(node.left, key)
                : searchRec(node.right, key);
    }

    /* ================= DELETE ================= */

    public void delete(int key) {
        root = deleteRec(root, key);
    }

    /**
     * 3 Cases:
     * 1. Leaf node
     * 2. One child
     * 3. Two children (replace with inorder successor)
     */
    private Node deleteRec(Node node, int key) {

        if (node == null) return null;

        if (key < node.key) {
            node.left = deleteRec(node.left, key);
        } else if (key > node.key) {
            node.right = deleteRec(node.right, key);
        } else {
            // Node found

            // Case 1 & 2: one or zero child
            if (node.left == null) return node.right;
            if (node.right == null) return node.left;

            // Case 3: two children
            Node successor = findMinNode(node.right);
            node.key = successor.key;
            node.right = deleteRec(node.right, successor.key);
        }

        return node;
    }

    /* ================= MIN / MAX ================= */

    public int findMin() {
        if (root == null) throw new IllegalStateException("Tree is empty");
        return findMinNode(root).key;
    }

    private Node findMinNode(Node node) {
        while (node.left != null) {
            node = node.left;
        }
        return node;
    }

    public int findMax() {
        if (root == null) throw new IllegalStateException("Tree is empty");

        Node curr = root;
        while (curr.right != null) {
            curr = curr.right;
        }
        return curr.key;
    }

    /* ================= HEIGHT ================= */

    public int height() {
        return height(root);
    }

    private int height(Node node) {
        if (node == null) return -1;

        int left = height(node.left);
        int right = height(node.right);

        return Math.max(left, right) + 1;
    }

    /* ================= TRAVERSALS ================= */

    public void inorder() {
        inorder(root);
        System.out.println();
    }

    private void inorder(Node node) {
        if (node == null) return;

        inorder(node.left);
        System.out.print(node.key + " ");
        inorder(node.right);
    }

    public void preorder() {
        preorder(root);
        System.out.println();
    }

    private void preorder(Node node) {
        if (node == null) return;

        System.out.print(node.key + " ");
        preorder(node.left);
        preorder(node.right);
    }

    public void postorder() {
        postorder(root);
        System.out.println();
    }

    private void postorder(Node node) {
        if (node == null) return;

        postorder(node.left);
        postorder(node.right);
        System.out.print(node.key + " ");
    }

    /* ================= VALIDATE BST ================= */

    public boolean isValidBST() {
        return isValidBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    private boolean isValidBST(Node node, long min, long max) {
        if (node == null) return true;

        if (node.key <= min || node.key >= max) return false;

        return isValidBST(node.left, min, node.key)
                && isValidBST(node.right, node.key, max);
    }

    /* ================= NODE ================= */

    static class Node {
        int key;
        Node left, right;

        Node(int key) {
            this.key = key;
        }
    }
}