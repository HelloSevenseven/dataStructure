package com.xxb.search;

/**
 * ƽ�������Ҳ��AVL��  ��AV+L�����˷�����
 * ƽ�����������������һ��������������ֻ����Ϊ����Ŷ����������������һЩ�����б������ʱ���൱������ ���ǲ��ҵ� ʱ�临�ӶȻ���O(n)��
 * 	,Ϊ�����ܹ���ƽ�⣬�ڶ�����������������һ��ƽ�����ӣ������������������ߵĲ�ľ���ֵ���ܴ���1������ƽ�����Ӿ���ֵ����1ʱ����Ҫ��ʼ��ת
 * 	��ƽ��������С��-1�ģ�����������ƽ�����Ӵ���1����������������ת�ܹؼ�
 * @author лС��
 *
 */
public class BalanceBinaryTree {
	class Node{
		int data;
		int bf;				//ƽ������
		Node lchild;
		Node rchild;
	}
	//����
	public void rRotate(Node root){
		Node tree = root.lchild;		//ָ���������ڵ�
		root.lchild = tree.rchild;		//tree���������ҽ�Ϊroot��������
		tree.rchild = root;
		root = tree;
	}
	//����
	public void lRotate(Node root){
		Node tree = root.rchild;
		root.rchild = tree.lchild;
		tree.lchild = root;
		root = tree;
	}
	
}



