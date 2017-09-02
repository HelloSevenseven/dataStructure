package com.xxb.list;

public class TestApp {

	public static void main(String[] args) {
		Node node = new Node(4);
		MylinkList linkList = new MylinkList();
		linkList.addFirstNode(1);   //头结点  位置为0
		linkList.insertNode(2, 1);  //位置1
		linkList.insertNode(3, 1);  //位置2
		linkList.insertNode(4, 3);  //位置3 
		linkList.insertNode(5, 2);
		
		//linkList.deleteNodeBypos(3);
		
		//linkList.nodeAll();
		
		
		
		linkList.displayNodeAll();
		Node no = linkList.findByNodepos(2);
		Node n = linkList.findByNodedata(3);
		linkList.deleteNodeBydata(3);
		System.out.println(no.data+" "+no.next.data);
		linkList.displayNodeAll();
		
	}
}
