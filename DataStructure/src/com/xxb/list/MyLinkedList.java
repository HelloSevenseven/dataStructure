package com.xxb.list;

public class MyLinkedList {
	
	//结点类
	private class Node{
		
		public Node next;   //后继
		public Node prev;	//前驱
		public Object data;
		public Node(Node prev, Object data, Node next){
			this.next = next;
			this.prev = prev;
			this.data = data;
		}
	}
	private Node first;
	private Node last;
	private int size;
	
	public MyLinkedList(){
		clear();
	}
	//清理列表
	public void clear(){
		first = new Node(null, null, null);
		last = new Node(first,null,null);
		first.next = last;
		size = 0;
	}
	//相当于从末尾插入一个元素
	public void add(int a){
		
		Node l = last;
		Node newNode = new Node(l, a, null);
		last = newNode;
		if(first == null){
			first = newNode;
		}else
			l.next = newNode;
		size++;
			
	}
	
	public void removeBy(Object data){
		Node cur = first;
		while(cur.data == data){
			
		}
	}
	
	//删除所有
	public void remove(){
		Node cur = first;
		while(cur.next != null){
			cur.next = cur.next.next;
		}
	}
}
