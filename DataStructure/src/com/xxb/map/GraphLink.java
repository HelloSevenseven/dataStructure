package com.xxb.map;

import java.io.IOException;
import java.util.Scanner;

/**
 * 建立图的邻接表结�?
 * 
 * @author 谢小�?
 *
 */
public class GraphLink {

	private class EdgeNode{    //边表节点
		private int adjvex; //存储顶点�?对应的下�?   
		private EdgeNode next;
	}
	private class Vertex{     //顶点表节�?
		private char data;   //顶点�?
		private EdgeNode firstedge;  //表示第一个头 如：a(0)->b(1)
	}
	
	private Vertex[] vertexs;
	
	boolean[] visited = new boolean[10];  //默认全为false  //判断节点是否被访�?
	
	public void CreateALGraph(int size,int numVertex){
		
		vertexs = new Vertex[size];           //顶点表数�?
		System.out.print("输入顶点信息�?  ");
		for(int i = 0 ; i<vertexs.length ; i++){
			vertexs[i] = new Vertex();
			vertexs[i].data = readChar();
			vertexs[i].firstedge = null;
		}
		for(int j = 0 ; j<numVertex ; j++){
			System.out.print("输入边（vi,vj）的两端顶点的信�?");
			
			char c1 = readChar(); //a
			char c2 = readChar(); //b
			int p1 = getPosition(c1);  //0
			int p2 = getPosition(c2);  //1
			
			//初始化node1
			EdgeNode node1 = new EdgeNode();
			node1.adjvex = p2;
			if(vertexs[p1].firstedge ==null)
				vertexs[p1].firstedge = node1;
			else
				linkLast(vertexs[p1].firstedge,node1);
			
			//初始化node2
			EdgeNode node2 = new EdgeNode();
			node2.adjvex = p1;
		 	if(vertexs[p2].firstedge == null)
				vertexs[p2].firstedge = node2;
			else
				linkLast(vertexs[p2].firstedge,node2);
		}
	}
	public char readChar(){
		char ch='0';
		do {
			try {
				ch = (char)System.in.read();
			}catch (IOException e) {
				e.printStackTrace();
			}
		} while(!((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z')));
		
		return ch;
	}
	public int readInt(){
		Scanner input = new Scanner(System.in);
		return input.nextInt();
	}
	/*
	 * 获取该顶点再数组中的位置
	 */
	public int getPosition(char c){   
		for(int k = 0 ;k<vertexs.length ; k++){
			if(vertexs[k].data == c){
				return k;
			}
		}
		return -1;
	}
	public void linkLast(EdgeNode list, EdgeNode node){
		EdgeNode p =list;
		while(p.next != null){
			p = p.next;
		}
		p.next = node;
	}
	public void print(){
		System.out.println("邻接表：");
		for(int i = 0 ; i<vertexs.length ; i++){
			System.out.printf("%c(%d)->",vertexs[i].data,i);
			EdgeNode node = vertexs[i].firstedge;
			while(node != null){
				System.out.printf("%c(%d)->",vertexs[node.adjvex].data,node.adjvex);
				node = node.next;	
			}
			System.out.println();
		}
		//System.out.println(vertexs[0].firstedge.adjvex);
	}
	/*
	 * 邻接表的深度优先遍历
	 */
	//深度优先递归算法
	public void DFS(int i){
		EdgeNode node;
		   
		visited[i] = true;
		
		System.out.printf("%c->",vertexs[i].data); //a  b
		node = vertexs[i].firstedge;  //b  a
		while(node != null){
			if(!visited[node.adjvex]){  //visited[1]  visited[0] visited[2] visited[0] visited[1]
				DFS(node.adjvex);
			}
			node = node.next;
		}
	}
	//邻接表的深度优先遍历
	public void DFSTraverse(int size){   //size为边�?
		        
		//for(int j = 0 ; j<size ; j++){
			if(!visited[1]){   
				DFS(1);
			}
		//}
	}
	public void BFSTraverse(int i){   //i 表示从第vertexs[i]�?始搜�?
		EdgeNode node;
		if(!visited[i]){
			visited[i] = true;
			System.out.printf("%c->",vertexs[i].data);
			node = vertexs[i].firstedge;
			while(node != null){
				
				System.out.printf("%c->",vertexs[node.adjvex].data);
				node = node.next;
			}
		}
	}
	public static void main(String[] args) {
		GraphLink g = new GraphLink();
		g.CreateALGraph(4, 5);
		g.print();
		g.DFSTraverse(4);
	}
}

