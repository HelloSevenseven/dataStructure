package com.xxb.list;

/**
 * ˫������
 * @author лС��
 *
 */
public class DoubleLinkedList {
	private DNode first;
	private DNode last;
	private int pos;
	
	/*
	 * ����ͷ���
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
	 * ����β���
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
	 * ���һ����㣨����ĩβ��
	 */
	public void addLinkedListNode(Object data){
		DNode node = new DNode(data);
		
		node.prior = last;
		last.next = node;
		last = node;
		
		pos++;
	}
	/*
	 * ����һ����㣬��ָ������֮�����
	 * data  ָ��������
	 * insertData  ���������
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
	 * ����һ����㣬��ָ������֮ǰ����
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
	 * ɾ��ָ�����ݵĽ��
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
