package com.xxb.sort;

import org.junit.Test;

/**
 * 冒泡排序
 * 时间复杂度 O(n2)
 * @author 谢小波
 *
 */
public class BubbleSort {

	//交换
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
	/*
	 * 第二种相对第一种，做了一些优化。
	 * 体现在：第一种可能随着每一个数的冒泡它会把一些小的数 移动到最后，效率非常低
	 */
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
		
	}
}
