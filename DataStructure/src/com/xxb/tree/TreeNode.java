package com.xxb.tree;

public class TreeNode {
	
	public Object data;
	public  TreeNode lchild;
	public TreeNode rchild;
	/*
	 * ����Ҷ�ӽڵ�
	 */
	public TreeNode(Object data) {
		this.data = data;
		lchild = rchild = null;
	}
	/*
	 * ��������
	 */
	public TreeNode(Object data,TreeNode lchild,TreeNode rchild) {
		this.data = data;
		this.lchild = lchild;
		this.rchild = rchild;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return data.toString();
	}

}
