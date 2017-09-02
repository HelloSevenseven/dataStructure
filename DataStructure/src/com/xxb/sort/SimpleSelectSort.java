package com.xxb.sort;

import org.junit.Test;

/**
 * ��ѡ������
 * ʱ�临�Ӷ� O(n2)
 * �򵥵�˵����ÿһ��Ѱ�ҳ���С���Ǹ���Ȼ��������
 * @author лС��
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
	//����
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
	
