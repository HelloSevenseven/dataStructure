package com.xxb.list;

public class MyLinkedList {
	
	//�����
	private class Node{
		
		public Node next;   //���
		public Node prev;	//ǰ��
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
	//�����б�
	public void clear(){
		first = new Node(null, null, null);
		last = new Node(first,null,null);
		first.next = last;
		size = 0;
	}
	//�൱�ڴ�ĩβ����һ��Ԫ��
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
	
	//ɾ������
	public void remove(){
		Node cur = first;
		while(cur.next != null){
			cur.next = cur.next.next;
		}
	}
}
