package com.xxb.tree;

/**
 * ������
 * @author лС��
 */
public class BinaryTree {
//	private Object data;
//	private BinaryTree lchild;
//	private BinaryTree rchild;
	/*
	 * ǰ�����
	 */
	public void preOrder(TreeNode root){
		if(root == null){
			return ;
		}else{
			System.out.print(root.data +" ");
			preOrder(root.lchild);
			preOrder(root.rchild);
		}
	}
	/*
	 * �������
	 */
	public void midOrder(TreeNode root){
		if(root == null){
			return ;
		}else{
			midOrder(root.lchild);
			System.out.print(root.data + " ");
			midOrder(root.rchild);
		}
	}
	/*
	 * �������
	 */
	public void postOrder(TreeNode root){
		if(root == null){
			return ;
		}else{
			postOrder(root.lchild);
			postOrder(root.rchild);
			System.out.print(root.data + " ");
			
		}
		
	}
	public void layoutOrder(TreeNode root){
		if(root == null){
			return ;
		}else{
			int index = 1;
			while(root.lchild != null||root.rchild!=null){
				index++;
				if(root.lchild !=null){
					root = root.lchild;
				}
				if(root.rchild != null){
					System.out.println("hello");
					root = root.rchild;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		TreeNode h = new TreeNode("H");
		TreeNode i = new TreeNode("I");
		TreeNode k = new TreeNode("K");
		TreeNode g = new TreeNode("G");
		TreeNode a = new TreeNode("A", h, i);
		TreeNode b = new TreeNode("B",k,null);
		TreeNode c = new TreeNode("C", a, b);
		BinaryTree binaryTree = new BinaryTree();
		binaryTree.preOrder(c);
		System.out.println();
		binaryTree.midOrder(c);
		System.out.println();
		binaryTree.postOrder(c);
	}
}
  