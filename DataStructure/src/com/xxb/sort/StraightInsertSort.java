package com.xxb.sort;

import org.junit.Test;

/**
 * 直接插入排序
 * 思路：按其顺序大小插入到前面已经排序的字序列的合适位置（从后向前找到合适位置后），直到全部插入排序完为止。
 * 时间复杂度  O(n2)
 * @author 谢小波
 */
public class StraightInsertSort {
	
	public void straightInsertSort(int[] list){
		int temp = 0;
		int j = 0;
		for(int i = 0; i<list.length; i++){
			temp = list[i];
			for(j = i; j>0&&temp<list[j-1]; j--){
				list[j] = list[j-1];
			}
			list[j] = temp;
			//System.out.print(list[j]+" ");
			for(int k = 0 ; k<list.length; k++){
				System.out.print(list[k]+" ");
			}
			System.out.println();
		}
		
//		for(int i = 0 ; i<list.length; i++){
//			System.out.print(list[i]+" ");
//		}
	}
	
	@Test
	public void test(){
		int[] list={3,5,1,7,4,2,10};
		straightInsertSort(list);	
	}
}
