package com.xxb.list;

/**
 * 双向链表
 * @author 谢小波
 *
 */
public class DoubleLinkedList {
	private DNode first;
	private DNode last;
	private int pos;
	
	/*
	 * 定义头结点
	 */
	public void addFirstNode(Object data){
		DNode node = new DNode(data);
		if(first == null){
			last = node;
		}else{
			node.next = first;
			first.prior = node;
		}
		first = node;
	}
	/*
	 * 定义尾结点
	 */
	public void addLastNode(Object data){
		DNode node = new DNode(data);
		if(first == null){
			first = node;
		}else{
			last.next = node;
			node.prior = last;
		}
		last = node;
	}
	/*
	 * 添加一个结点（插入末尾）
	 */
	public void addLinkedListNode(Object data){
		DNode node = new DNode(data);
		
		node.prior = last;
		last.next = node;
		last = node;
		
		pos++;
	}
	/*
	 * 插入一个结点，在指定数据之后插入
	 * data  指定的数据
	 * insertData  插入的数据
	 */
	public void insertNodelater(Object data,Object insertData){
		DNode node = new DNode(insertData);
		DNode other = first;
		while(other.data != data){
			other = other.next;
			
		}
		node.prior = other;
		node.next = other.next;
		other.next = node;
		
		pos++;
	}
	/*
	 * 插入一个结点，在指定数据之前插入
	 */
	public void insertNodebefore(Object data,Object insertData){
		DNode node = new DNode(insertData);
		DNode other = first;
		while(other.data != data){
			other = other.next;
		}
		node.next = other;
		node.prior = other.prior;
		other.prior = node;
		pos++;
	}
	/*
	 * 删除指定数据的结点
	 */
	public void DeleteNode(Object data){
		DNode node ;
		DNode other = first;
		while(other.data != data){
			other = other.next;
		}
		node = other;
		node.prior.next = node.next;
		node.next.prior = node.prior;
		
		pos--;
	}
	public void display(){
		
		while(first.next != null){
			System.out.print(first.data + " ");
			first = first.next;
		}
		System.out.println(first.data);
		
	}
	public static void main(String[] args) {
		DoubleLinkedList dou = new DoubleLinkedList();
		dou.addFirstNode(0);
		//dou.addLastNode(0);
		dou.addLinkedListNode(1);
		dou.addFirstNode(2);
		dou.addLinkedListNode(3);
		dou.addLinkedListNode(4);
		dou.insertNodelater(3, 5);
		dou.DeleteNode(3);
		dou.insertNodebefore(5, 3);
		dou.display();
	}

}
