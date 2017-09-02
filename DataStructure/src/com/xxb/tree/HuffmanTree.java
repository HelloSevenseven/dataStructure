package com.xxb.tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 哈夫曼树
 * @author 谢小�?
 *
 */
public class HuffmanTree {
	
	public static Node createTree(List<Node> nodes){
		while(nodes.size()>1){
			//对节点进行排�?
			Collections.sort(nodes);
			//选取权�?�最小的两个结点
			Node left = nodes.get(nodes.size()-1);
			Node right = nodes.get(nodes.size()-2);
			//创建新节�?
			Node parent = new Node(null,left.getWeight()+right.getWeight());
			parent.setLeft(left);
			parent.setRight(right);
			//将这两个节点从队列中删除
			nodes.remove(left);
			nodes.remove(right);
			//加入新节�?
			nodes.add(parent);
		}
		return nodes.get(0);
	}
	
	/*
	 * 广度优先遍历
	 */
	public static List<Node> breath(Node root){
		List<Node> list = new ArrayList<Node>();
		Queue<Node> queue = new LinkedList<Node>();
		queue.add(root);
		while(!queue.isEmpty()){
			Node pNode = queue.poll();
			list.add(pNode);
			if(pNode.getLeft() != null){
				queue.add(pNode.getLeft());
			}
			if(pNode.getRight()!= null){
				queue.add(pNode.getRight());
			}
		}
		return list;
	}
	public static void main(String[] args) {
		List<Node> list = new ArrayList<Node>();
		list.add(new Node("a", 5));
		list.add(new Node("b", 19));
		list.add(new Node("c", 8));
		list.add(new Node("d", 12));
		Node root = HuffmanTree.createTree(list);
		System.out.println(HuffmanTree.breath(root));
	}

}
