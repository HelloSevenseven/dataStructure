package com.xxb.list;

public class MyArrayList {
	
	private String[] arrys ;    // 存放数据的数组
	private int maxsize;     //数组大小
	private int size;      //线性表大小
	
	public MyArrayList(int s){
		maxsize = s;
		arrys = new String[maxsize];
	}
	
	//默认长度为10
	public MyArrayList(){
		this(10);
	}
	//默认从末尾插入
	public void set(String str){
		
		//扩容
		if(size == maxsize){
			String[] newarrays;
			String[] oldarrays;
			oldarrays = arrys;
			newarrays = new String[(int)(maxsize*1.5)];
			for(int j=0; j<size; j++){
				newarrays[j] = oldarrays[j];
			}
			maxsize = (int) (maxsize*1.5);
			arrys = newarrays;
		}
		
		arrys[size] = str;
		size++;
		return ;
	}
	/*
	 * 插入元素
	 */
	public void ListInsert(int i,String str) {
		if(i>size){
			throw new IllegalArgumentException("当前线性表的大小为："+size+" 你要插入的位置大于线性表的大小");
		}
		if(i<0){
			throw new IllegalArgumentException("插入元素的位置小于0");
		}
		/*
		 * 数组已满，需要扩容
		 */
		if(size==maxsize){
			String[] newarrys;
			String[] oldarrys;
			oldarrys = arrys;
			newarrys = new String[(int) (maxsize*1.5)];
			for(int j=0 ; j<size ; j++){
				newarrys[j] = oldarrys[j];
			}
			maxsize = (int) (maxsize*1.5);
			arrys = newarrys;
		}
		if(i == size){
			arrys[i] = str;
			size++;
			return ; 
		}
		//移动位置
		for(int j=size ; j>i ; j--){
			arrys[j] = arrys[j-1];
		}
		arrys[i] = str;
		size++;
	}
	public void ListDelete(int i){
		if(i>size){
			throw new IllegalArgumentException("当前线性表长度为："+size+",删除的位置大于线性表长度");
		}
		if(i<0){
			throw new IllegalArgumentException("i<0");
		}
		//arrys[i] =null;
		
		if(i == size){
			arrys[i] = null;
			size--;
			return ;
		}
		for(int j=i;j<size-1;j++){
			arrys[j]=arrys[j+1];
		}
		arrys[size-1] = null;
		size--;
	}
	public void removeAll(){
		if(arrys!=null){
			for(int i=0 ; i<size ; i++){
				arrys[i] = null;
			}
			size = 0;
		}
	}
	
	public void look(){
		if(arrys!=null){
			for(int i=0 ; i<arrys.length ; i++){
				
				System.out.print(arrys[i]+" ");
				
			}
			System.out.println();
			System.out.println(size);
		}
	}

	public static void main(String[] args) {
		
		MyArrayList mylist = new MyArrayList(10);
//		mylist.ListInsert(0, "0");
//		mylist.ListInsert(1, "1");
//		mylist.ListInsert(2, "2");
//		mylist.ListInsert(3, "3");
//		mylist.ListInsert(4, "4");
//		mylist.ListInsert(5, "5");
//		mylist.ListInsert(6, "6");
		
//		mylist.ListDelete(4);
//		
//		mylist.removeAll();
		mylist.set("0");
		mylist.set("1");
		
		mylist.look();
	}
}
