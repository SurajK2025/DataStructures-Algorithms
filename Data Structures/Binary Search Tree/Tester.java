package com.binarySearchTree;

public class Tester {

	public static void main(String[] args) {
		BinarySearchTree bst = new BinarySearchTree();
		bst.insert(50);
		bst.insert(40);
		bst.insert(30);
		bst.insert(35);
		bst.insert(60);
		bst.insert(55);
		bst.insert(70);
		
		bst.preOrder();
		bst.inOrder();
		bst.postOrder();
	}
}