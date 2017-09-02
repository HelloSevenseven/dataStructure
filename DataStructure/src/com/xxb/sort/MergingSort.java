package com.xxb.sort;

import org.junit.Test;

/**
 * 归并排序
 * 归并（Merge）排序法是将两个（或两个以上）有序表合并成一个新的有序表，即把待排序序列分为若干个子序列，每个子序列是有序的。
 * 然后再把有序子序列合并为整体有序序列。
 * @author 谢小波
 */
public class MergingSort {
	
	public void merge(int[] list,int low,int mid,int high){
		int[] temp = new int[high-low+1];
		int i = low;
		int j = mid+1;
		int k = 0;
		
		//左右半比较 先移金较小的数
		while(i<=mid&&j<=high){
			if(list[i]<list[j]){
				temp[k++] = list[i++];
			}else
				temp[k++] = list[j++];
		}
		//将左边剩余的插入
		while(i <= mid){
			temp[k++] = list[i++];
		}
		//将右边剩余的插入
		while(j <= high){
			temp[k++] = list[j++];
		}
		//覆盖list
		for(int s = 0; s<temp.length; k++){
			list[s+low] = temp[s];
		}
		
	}
	public int[] mergingSort(int[] list, int low, int high ){
		int mid = (low+high)/2;
		//这个条件应该怎么写？
		if(low<high){
			mergingSort(list,low,mid);
			
			mergingSort( list, mid+1, high);
			
			merge(list, low, mid, high);
		}
		
		return list;
	}

	@Test
	public void test(){
		int[] list={6,8,2,4,5,7,3,1};
		mergingSort(list, 0, 7);
		
	}
}




