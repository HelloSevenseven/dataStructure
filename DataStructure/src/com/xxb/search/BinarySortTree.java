package com.xxb.search;

/**
 * ����������Ҳ�ƶ��������
 * �������һ�ſ�����Ҳ������һ�ţ�
 * 		�������������գ����������������н���ֵ��С�ڸ���㣻
 * 		�������������գ����������������н���ֵ�����ڸ���㣻
 * 		������������Ҳ��Ϊ������������
 * @author лС��
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
	//����
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
		
		
		if(root.lchild == null){		//���������Ϊ�գ�ֱ�ӽ�������
			root = root.rchild;
		}if(root.rchild == null){		//���������Ϊ�գ�ֱ�ӽ�������
			root = root.lchild;
		}else {
			
		}
		return true;
	}
}



