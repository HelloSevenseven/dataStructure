package com.xxb.search;


public class BalanceBinaryTree {
	class Node{
		int data;
		int bf;
		Node lchild;
		Node rchild;
	}
	//����
	public void rRotate(Node root){
		Node tree = root.lchild;
		root.lchild = tree.rchild;
		tree.rchild = root;
		root = tree;
	}

	public void lRotate(Node root){
		Node tree = root.rchild;
		root.rchild = tree.lchild;
		tree.lchild = root;
		root = tree;
	}
	
}



