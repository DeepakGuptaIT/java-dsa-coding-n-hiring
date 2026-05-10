package com.firealgo.dsandalgo.algo.bst;
/*
 Input:
 int[] values = {50, 30, 20, 40, 70, 60, 80};

 Constructed Binary Search Tree (BST):

                50
              /    \
            30      70
           /  \    /  \
         20   40  60   80


 Inorder Traversal (Left → Root → Right):
 20 → 30 → 40 → 50 → 60 → 70 → 80   (Sorted Output)

 Preorder Traversal (Root → Left → Right):
 50 → 30 → 20 → 40 → 70 → 60 → 80

 Postorder Traversal (Left → Right → Root):
 20 → 40 → 30 → 60 → 80 → 70 → 50

 Height of Tree (edge-based):
 2
*/
public class BSTTest {

    public static void main(String[] args) {

        BinarySearchTree bst = new BinarySearchTree();

        int[] values = {50, 30, 20, 40, 70, 60, 80};

        for (int val : values) {
            bst.insert(val);
        }

        System.out.println("Inorder (Sorted):");
        bst.inorder();

        System.out.println("Preorder:");
        bst.preorder();

        System.out.println("Postorder:");
        bst.postorder();

        System.out.println("Search 40: " + bst.search(40));
        System.out.println("Search 100: " + bst.search(100));

        System.out.println("Min: " + bst.findMin());
        System.out.println("Max: " + bst.findMax());

        System.out.println("Height: " + bst.height());

        System.out.println("Is Valid BST: " + bst.isValidBST());

        System.out.println("\nDeleting 50 (root with 2 children)");
        bst.delete(50);

        System.out.println("Inorder after deletion:");
        bst.inorder();
    }
}