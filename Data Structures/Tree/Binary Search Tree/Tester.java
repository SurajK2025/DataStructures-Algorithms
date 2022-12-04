package com.bst;

public class Tester {
	public static void main(String[] args) {
		BST bst = new BST();
		bst.insert(50);
		bst.insert(40);
		bst.insert(70);
		bst.insert(45);
		bst.insert(10);
		bst.insert(60);
		bst.insert(90);
		
		System.out.println("Height of tree: "+bst.heightoftree(bst.getRoot())+"\n");
		
		bst.preOrder(bst.getRoot());
		bst.preOrder();
		
		System.out.println();
		bst.inOrder(bst.getRoot());
		bst.inOrder();
		
		System.out.println();
		bst.postOrder(bst.getRoot());
		bst.postOrder();
		
		System.out.print("\nMin element: "+bst.getMin());
		
		System.out.print("\nMax element: "+bst.getMax());
		
		System.out.println("\n\n"+bst.deleteNode(45));
		bst.inOrder(bst.getRoot());
	}
}
