package com.xxb.sort;

import org.junit.Test;

/**
 * 简单选择排序
 * 时间复杂度 O(n2)
 * 简单的说就是每一趟寻找出最小的那个数然后做交换
 * @author 谢小波
 *
 */
public class SimpleSelectSort {

	
	
	public void simpleSelectSort(int[] list){
		int min;
		for(int i = 0; i<list.length; i++){
			min = i;
			for(int j = i; j<list.length; j++){
				if(list[min] > list[j])
					min=j;
			}
			if(i!=min){
				swap(list, i, min);
			}
		} 
		for(int i = 0; i<list.length; i++){
			System.out.print(list[i]+" ");
		}
	}
	//交换
	public void swap(int[] list, int i, int j){
		int temp = list[i];
		list[i] = list[j];
		list[j] = temp;
	}
	
	@Test
	public void test(){
		int[] list={3,5,1,7,4,2};
		simpleSelectSort(list);
	}
}
	
