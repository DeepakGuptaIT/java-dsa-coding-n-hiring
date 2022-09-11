package com.firelago.rivision;

public class BinarySearchTree {
	class Node {
		int key;
		Node left,right;
		Node(int key) {
			this.key = key;
			left = null;
			right = null;
		}
	}
	Node root;
	BinarySearchTree() {
		root = null;
	}
	
	public void insertNode(int key) {
		this.root = insertNodeRec(this.root, key);
		
	}
	private Node insertNodeRec(Node root, int key) {
		if(root == null) {
			Node node = new Node(key);
			root = node;
		} else {
			// recurcivly add
			if(key< root.key) {
				root.left = insertNodeRec(root.left, key);
			} else if(key > root.key){
				root.right = insertNodeRec(root.right, key);
			}
		}
		return root;
	}
	
	public void inoder() {
		inorderRec(this.root);
	}
	
	

	private void inorderRec(Node root) {
		if(root!= null) {
			inorderRec(root.left);
			System.out.println(root.key);
			inorderRec(root.right);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinarySearchTree bst = new BinarySearchTree();
		bst.insertNode(5);
		bst.insertNode(4);
		bst.insertNode(12);
		bst.insertNode(10);
		System.out.println(bst);
		bst.inoder();

	}

}
