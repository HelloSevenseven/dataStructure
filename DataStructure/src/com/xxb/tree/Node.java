package com.xxb.tree;

/**
 * 树的结点
 * 此接口强行对实现它的每个类的对象进行整体排序。
 * 这种排序被称为类的自然排序，类的 compareTo 方法被称为它的自然比较方法。
 */
public class Node implements Comparable<Node> {

	private Object data;
	private double weight;
	private Node left;
	private Node right;
	
	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public Node getLeft() {
		return left;
	}

	public void setLeft(Node left) {
		this.left = left;
	}

	public Node getRight() {
		return right;
	}

	public void setRight(Node right) {
		this.right = right;
	}

	public int compareTo(Node o) {
		if(o.weight>this.weight){
			return 1;
		}else if(o.weight<this.weight){
			return -1;
		}
		return 0;
	}
	public Node(Object data,double weight){
		this.data = data;
		this.weight = weight;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "data:"+this.data+" whight:"+this.weight;
	}
}
