package com.xxb.sort;

import org.junit.Test;

/**
 * ��������
 * ͨ��һ�����򽫴������¼�ָ�ɶ����������֣�����һ���ּ�¼�Ĺؼ��־�����һ���ֹؼ���С��
 * 	��ֱ���������ּ�����������ֱ��������������
 * ʱ�临�Ӷ� O(nlogn)
 * @author лС��
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
			
			quickSort(list, low, pivot-1);   //������
			
			quickSort( list, pivot+1, high);    //������
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



