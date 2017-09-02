package com.xxb.list;

public class MyArrayList {
	
	private String[] arrys ;    // ������ݵ�����
	private int maxsize;     //�����С
	private int size;      //���Ա��С
	
	public MyArrayList(int s){
		maxsize = s;
		arrys = new String[maxsize];
	}
	
	//Ĭ�ϳ���Ϊ10
	public MyArrayList(){
		this(10);
	}
	//Ĭ�ϴ�ĩβ����
	public void set(String str){
		
		//����
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
	 * ����Ԫ��
	 */
	public void ListInsert(int i,String str) {
		if(i>size){
			throw new IllegalArgumentException("��ǰ���Ա�Ĵ�СΪ��"+size+" ��Ҫ�����λ�ô������Ա�Ĵ�С");
		}
		if(i<0){
			throw new IllegalArgumentException("����Ԫ�ص�λ��С��0");
		}
		/*
		 * ������������Ҫ����
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
		//�ƶ�λ��
		for(int j=size ; j>i ; j--){
			arrys[j] = arrys[j-1];
		}
		arrys[i] = str;
		size++;
	}
	public void ListDelete(int i){
		if(i>size){
			throw new IllegalArgumentException("��ǰ���Ա���Ϊ��"+size+",ɾ����λ�ô������Ա���");
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
