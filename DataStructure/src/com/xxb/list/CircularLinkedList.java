package com.xxb.list;

public class CircularLinkedList {
	
	class CNode{
		Object data;
		CNode next;
//		public CNode(Object data) {
//			this.data = data
//		}
		
	}

	private CNode head = null;
	public void initCLinkedList(){
		head = new CNode();
		head.data = null;
		head.next = null;
	}
	public void insertCLinkedList(Object data){
		CNode cnode = new CNode();
		if(head == head.next){
			head.next = cnode;
			cnode.next = head;
		}else{
			CNode cur = head;
			while(cur.next != head){          //? 不能插入到指定的位置
				cur = cur.next;
			}
			cur.next = cnode;
			cnode.next = head;
		}
	}
}
