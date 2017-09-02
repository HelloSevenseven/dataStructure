package com.xxb.search;

/**
 * 二叉排序树也称二叉查找树
 * 其可以是一颗空树，也可以是一颗：
 * 		若其左子树不空，则其左子树上所有结点的值均小于根结点；
 * 		若其右子树不空，则其右子树上所有结点的值均大于根结点；
 * 		它的左右子树也均为二叉排序树。
 * @author 谢小波
 *
 */
public class BinarySortTree {

	class Node{
		int data;
		Node lchild;
		Node rchild;
		Node(int data, Node lchild, Node rchild){
			this.data = data;
			this.lchild = lchild;
			this.rchild = rchild;
		}
		
	}
	//查找
	public boolean searchTree(Node tree, int key ){
		if(key == tree.data){
			return true;
		}else if(tree.data<key){
			return searchTree(tree.lchild,key);
		}else if(tree.data>key)
			return searchTree(tree.rchild, key);
		else if(tree.lchild==null||tree.rchild==null){
			return false;
		}
		return false;
	}
	public void insertTree(){
		
	}
	public boolean deleteTree(Node root, int key){
		
		if(root.data == key){
			return delete(root, key);
		}else if(key < root.data){
			return deleteTree(root.lchild , key);
		}else if(key > root.data){
			return  deleteTree(root.rchild,key);
		}else if(root.lchild == null||root.rchild==null){
			return false;
		}
		return false;
	}
	public boolean delete(Node root,int key){
		
		
		if(root.lchild == null){		//如果左子树为空，直接接右子树
			root = root.rchild;
		}if(root.rchild == null){		//如果右子树为空，直接接左子树
			root = root.lchild;
		}else {
			
		}
		return true;
	}
}



