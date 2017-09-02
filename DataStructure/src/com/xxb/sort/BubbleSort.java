package com.xxb.sort;

import org.junit.Test;


public class BubbleSort {

	public void swap(int[] list, int i, int j){
		int temp = list[i];
		list[i] = list[j];
		list[j] = temp;
	}

	public void bubbleSort(int[] list){
		
		for(int i=0; i<list.length; i++){
			for(int j=i; j<list.length; j++){
				if(list[i] > list[j]){
					swap(list, i, j);
				}
			}
			for(int s = 0; s<list.length; s++){
				System.out.print(list[s]+" ");
			}
			System.out.println();
		}
//		for(int i = 0; i<list.length; i++){
//			System.out.print(list[i]+" ");
//		}
	}

	public void bubbleSort01(int[] list){
		
		for(int i=0; i<list.length; i++){
			for(int j=(list.length-2); j>=i; j--){
				if(list[j] > list[j+1]){
					swap(list, j, j+1);
				}
			}
			for(int s = 0; s<list.length; s++){
				System.out.print(list[s]+" ");
			}
			System.out.println();
		}
		
	}
	@Test
	public void test(){
		int[] list={3,5,1,7,4,2};
		System.out.println(list.length);
		//bubbleSort(list);
		bubbleSort01(list);
		//大傻逼dashabi
	}
}
