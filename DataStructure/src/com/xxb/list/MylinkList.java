package com.xxb.list;

/**
 * ������
 * @author лС��
 */
public class MylinkList {
	public Node first;   //����һ��ͷ���
	private int pos;     //ͷ����λ��
	
	/*
	 * ����һ��ͷ���
	 */
	public  void addFirstNode(int data){
		Node node = new Node(data);
		node.next = first;
		first = node;
	}
	/*
	 * ����һ��Ԫ��
	 */
	public void insertNode(int data,int i){
		Node node = new Node(data);   //Ҫ����Ľ��
		Node prev = first;  
		Node cur = first;          //��prev��cur�в���   cur�ɳ�Ϊ�α�           
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
	 * ɾ��һ����㣬���ݽ��λ��
	 */
	public Node deleteNodeBypos(int i){  //����ֵ����Ϊvoid
		Node cur = first;
		Node prev = first;
		//��ͷ��㿪ʼ�������������ڵ�λ��
		for(int j = i ; pos<j ; pos++){
			prev = cur;
			cur = cur.next;
		}
		prev.next = cur.next;   //ɾ���Ĺؼ�һ��   ��ָ�룺p->next = p->next->next
		return cur;
	}
	/*
	 * ɾ��һ����㣬���ݽ���data
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
	 * ɾ�����н��
	 */
	public void removeAllNode(){
		Node cur = first;
		while(cur.next != null){
			cur.next = cur.next.next;
		}
	}
	/*
	 * ���ݽ���λ�ò��ҽ�����Ϣ
	 */
	public Node findByNodepos(int i){
		Node cur = first;
		for(int j = i ; pos<j ; pos++){
			cur = cur.next;
		}
		
		return cur;
	}
	/*
	 * ���ݽ������ݲ��ҽ�����Ϣ
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
	 * ͳ�ƽ�������
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
	 * ��ʾ���н�����Ϣ
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

