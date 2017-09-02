package com.xxb.list;

/**
 * 单链表
 * @author 谢小波
 */
public class MylinkList {
	public Node first;   //定义一个头结点
	private int pos;     //头结点的位置
	
	/*
	 * 定义一个头结点
	 */
	public  void addFirstNode(int data){
		Node node = new Node(data);
		node.next = first;
		first = node;
	}
	/*
	 * 插入一个元素
	 */
	public void insertNode(int data,int i){
		Node node = new Node(data);   //要插入的结点
		Node prev = first;  
		Node cur = first;          //在prev和cur中插入   cur可称为游标           
		while(pos != i){
			prev = cur;
			cur = cur.next;
			pos++;
		}
		node.next = cur ;
		prev.next = node;
		pos = 0;
	}
	/*
	 * 删除一个结点，根据结点位置
	 */
	public Node deleteNodeBypos(int i){  //返回值可以为void
		Node cur = first;
		Node prev = first;
		//从头结点开始查找这个结点所在的位置
		for(int j = i ; pos<j ; pos++){
			prev = cur;
			cur = cur.next;
		}
		prev.next = cur.next;   //删除的关键一步   用指针：p->next = p->next->next
		return cur;
	}
	/*
	 * 删除一个结点，根据结点的data
	 */
	public void deleteNodeBydata(int data){
		Node prev = first;
		Node cur = first;
		while(cur.data != data){
			if(cur.next ==null){
				break;
				//return null;
			}
			prev =cur;
			cur = cur.next;
		}
		if(cur == first){
			first = first.next;
		}else{
			prev.next = cur.next;
		}
		//return cur;
	}
	/*
	 * 删除所有结点
	 */
	public void removeAllNode(){
		Node cur = first;
		while(cur.next != null){
			cur.next = cur.next.next;
		}
	}
	/*
	 * 根据结点的位置查找结点的信息
	 */
	public Node findByNodepos(int i){
		Node cur = first;
		for(int j = i ; pos<j ; pos++){
			cur = cur.next;
		}
		
		return cur;
	}
	/*
	 * 根据结点的数据查找结点的信息
	 */
	public Node findByNodedata(int data){
		Node cur = first;
		while(cur.data!=data){
			if(cur.next == null){
				return null;
			}
			cur = cur.next;
		}
		return cur;
	}
	/*
	 * 统计结点的数量
	 */
	public int nodeAll(){
		Node cur = first;
		while(cur.next!=null){
			pos++;
			cur = cur.next;
		}
		System.out.println(pos);
		return pos;
	}
	/*
	 * 显示所有结点的信息
	 */
	public void displayNodeAll(){
		Node cur = first;
		while(cur != null){
			cur.display();
			cur = cur.next;
		}
		System.out.println();
	}
}

