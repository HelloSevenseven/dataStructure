package com.xxb.sort;

import org.junit.Test;

/**
 * 快速排序
 * 通过一趟排序将待排序记录分割成独立的两部分，其中一部分记录的关键字均比另一部分关键字小，
 * 	则分别对这两部分继续进行排序，直到整个序列有序。
 * 时间复杂度 O(nlogn)
 * @author 谢小波
 *
 */
public class QuickSort {

	public void swap(int[] list, int i, int j){
		int temp = list[i];
		list[i] = list[j];
		list[j] = temp;
	}
	public int partition(int[] list, int low, int high){
		int pivotkey;
		pivotkey = list[low];
		while(low < high){
			while(low < high && list[high] >= pivotkey){
				high--;
			}
			swap(list,low,high);
			while(low<high && list[low]<=pivotkey)
				low++;
			swap(list, low, high);
		}
		return low;
		
	}
	
	public int[] quickSort(int[] list, int low, int high){
		int pivot;
		if(low<high){
			pivot = partition(list, low, high);
			
			quickSort(list, low, pivot-1);   //左序列
			
			quickSort( list, pivot+1, high);    //右序列
		}
		return list;
	}
	
	@Test
	public void test(){
		int[] list={3,5,1,7,4,2,8,6};
		int[] lista = quickSort(list, 0, 7);
		for(int i = 0; i<list.length; i++){
			System.out.print(lista[i]+" ");
		}
	}
}



