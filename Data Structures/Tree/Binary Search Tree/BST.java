package com.bst;

import java.util.Stack;

public class BST {
	Node root;

	public Node getRoot() {
		return root;
	}

	public int heightoftree(Node root)  
	{
		if(root==null)
			return -1;    
		else
		{	
		int left=heightoftree(root.left);   
		int right=heightoftree(root.right);   
		 if (left>right)        
			 return left+1; 
		 else
		 	return right+1;
		}
	}
	
	public boolean insert(int data) {
		Node newNode = new Node(data);
		if(root == null) {
			root = newNode;
			return false;
		}

		Node temp = root;
		while(true) {
			if(temp.getData() == data) return false;

			if(data < temp.getData()) {
				if(temp.getLeft()==null) {
					temp.setLeft(newNode);
					return true;
				}
				temp = temp.getLeft();
			}
			else {
				if(temp.getRight()==null) {
					temp.setRight(newNode);
					return true;
				}
				temp = temp.getRight();
			}
		}
	}

	public void preOrder(Node root) {
		if(root == null) return;

		System.out.print(root.getData()+" ");
		preOrder(root.getLeft());
		preOrder(root.getRight());
	}

	public void preOrder() {
		if(root == null) return;

		System.out.println("\nPreOrder: ");
		Stack<Node> stack = new Stack<>();
		Node temp = root;

		while(temp!=null || !stack.isEmpty()) {
			while(temp!=null) {
				System.out.print(temp.getData()+" ");
				stack.push(temp);
				temp = temp.getLeft();
			}
			temp = stack.pop();
			temp = temp.getRight();
		}
		System.out.println();
	}

	public void inOrder(Node root) {
		if(root == null) return;

		inOrder(root.getLeft());
		System.out.print(root.getData()+" ");
		inOrder(root.getRight());
	}

	public void inOrder() {
		if(root == null) return;

		System.out.println("\nInOrder: ");
		Stack<Node> stack = new Stack<>();
		Node temp = root;

		while(temp!= null || !stack.isEmpty()) {
			while(temp!=null) {
				stack.push(temp);
				temp = temp.getLeft();
			}
			temp = stack.pop();
			System.out.print(temp.getData()+" ");
			temp = temp.getRight();
		}
		System.out.println();
	}

	public void postOrder(Node root) {
		if(root == null) return;

		postOrder(root.getLeft());
		postOrder(root.getRight());
		System.out.print(root.getData()+" ");
	}

	public void postOrder() {
		if(root == null) return;

		class Pair{
			Node node;
			char flag;

			Pair(Node node, char flag){
				this.node = node;
				this.flag = flag;
			}
		}

		System.out.println("\nPostOrder: ");
		Stack<Pair> stack = new Stack<>();
		Node temp = root;

		while(temp!=null || !stack.isEmpty()) {
			while(temp!=null) {
				stack.push(new Pair(temp, 'L'));
				temp = temp.getLeft();
			}

			Pair pair = stack.pop();

			if(pair.flag == 'L') {
				temp = pair.node.getRight();
				pair.flag = 'R';
				stack.push(pair);
			}
			else {
				System.out.print(pair.node.getData()+" ");
			}
		}
		System.out.println();
	}

	public Integer getMin() {
		if(root == null) return null;

		Node temp = root;
		while(temp.getLeft()!=null) {
			temp = temp.getLeft();
		}
		return temp.getData();
	}

	public Integer getMax() {
		if(root == null) return null;

		Node temp = root;
		while(temp.getRight()!=null) {
			temp = temp.getRight();
		}
		return temp.getData();
	}

	public boolean deleteNode(int data) {
		/*
		 * 	1.Locate delete-able node along with its parent node - using while loop
		 * 	2.Check if the delete-able node is a terminal node - if yes, set it null using parent node
		 *  3.If delete-able node is not a root node, swap it with MAX from left subtree or with MIN from right subtree.
		 *  4.Step 2 and 3 should be in a single infinite while loop.
		 */
		if(root == null) return false;

		Node parent=root, del=root;
		while(del.getData() != data) {
			parent = del;
			if(data < del.getData())
				del = del.getLeft();
			else
				del = del.getRight();

			if(del == null)
				return false;
		}

		while(true) {
			if(del.getLeft() == null && del.getLeft() == null) {
				if(del == root) {
					root = null;
					return true;
				}
				if(parent.getLeft() == del) 
					parent.setLeft(null);
				else
					parent.setRight(null);
				return true;
			}

			if(del.getLeft() != null) {
				Node max = del.getLeft();
				parent = del;

				while(max.getRight() != null) {
					parent = max;
					max = del.getRight();
				}

				int temp = del.getData();
				del.setData(max.getData());
				max.setData(temp);
				
				del = max;
			}
			else {
				Node min = del;
				parent = del;
				
				while(min.getRight() != null) {
					parent = min;
					min = min.getLeft();
				}
				int temp = del.getData();
				del.setData(min.getData());
				min.setData(temp);
				
				del = min;
			}
		}
	}
}














