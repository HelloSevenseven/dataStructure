package com.xxb.list;

public class TestApp {

	public static void main(String[] args) {
		Node node = new Node(4);
		MylinkList linkList = new MylinkList();
		linkList.addFirstNode(1);   //ͷ���  λ��Ϊ0
		linkList.insertNode(2, 1);  //λ��1
		linkList.insertNode(3, 1);  //λ��2
		linkList.insertNode(4, 3);  //λ��3 
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
