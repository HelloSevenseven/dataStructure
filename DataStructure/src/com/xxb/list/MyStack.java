package com.xxb.list;

public class MyStack {
	private static final int MAXSIZE=10;
	private int top;
	private int data[] = new int[MAXSIZE];
	
	/*
	 * 进栈操作
	 */
	public void push(int e){
		if(top <= MAXSIZE){
			data[top] = e;
			top++;
		}else{
			throw new IllegalArgumentException("栈满");
		}
	}
	/*
	 * 出栈操作
	 */
	public void pop(){
		top--; 
		
	}
	public void display(){
		for(int i = 0 ; i<top ; i++){
			System.out.print(data[i]+" ");
		}
	}
	 
	public static void main(String[] args) {
		MyStack stack = new MyStack();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.pop();
		stack.display();
		
	}

}
