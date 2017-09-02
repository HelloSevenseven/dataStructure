package com.xxb.search;

/**
 * 平衡二叉树也称AVL树  是AV+L两个人发明的
 * 平衡二叉树，首先它是一个二叉排序树，只不过为了这颗二叉排序树不会出现一些情况（斜树，此时，相当于链表 这是查找的 时间复杂度还是O(n)）
 * 	,为了它能够更平衡，在二叉排序树上引入了一个平衡因子（左子树于右子树两者的差的绝对值不能大于1），当平衡因子绝对值大于1时，就要开始旋转
 * 	若平衡因子是小于-1的，则左旋，若平衡因子大于1，则右旋。所以旋转很关键
 * @author 谢小波
 *
 */
public class BalanceBinaryTree {
	class Node{
		int data;
		int bf;				//平衡因子
		Node lchild;
		Node rchild;
	}
	//右旋
	public void rRotate(Node root){
		Node tree = root.lchild;		//指向左子树节点
		root.lchild = tree.rchild;		//tree的右子树挂接为root的左子树
		tree.rchild = root;
		root = tree;
	}
	//左旋
	public void lRotate(Node root){
		Node tree = root.rchild;
		root.rchild = tree.lchild;
		tree.lchild = root;
		root = tree;
	}
	
}



