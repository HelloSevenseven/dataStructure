package com.xxb.sort;

import org.junit.Test;

/**
 * 希尔排序（插入排序）
 * 时间复杂度 O(n3/2)
 * 思路：先将整个待排序的记录序列分割成为若干子序列分别进行直接插入排序，
 * 		待整个序列中的记录“基本有序”时，再对全体记录进行依次直接插入排序（最后能进行直接插入排序，是因为increment为1了）。
 * @author 谢小波
 *
 */
public class ShellSort {

	public void shellSort(int[] list){
		int increment;
		int temp = 0;
		int j = 0;
		for(increment = list.length/2; increment>0; increment/=2){
			for(int i = increment; i<list.length; i++){
				temp = list[i];
				for( j = i; j>=increment; j-=increment){
					if(temp < list[j-increment]){
						list[j] = list[j-increment];
					}else{
						break;
					}
				}
				list[j] = temp;
			}
			for(int i = 0; i<list.length; i++){
				System.out.print(list[i]+" ");
			}
			System.out.println();
		}
//		for(int i = 0; i<list.length; i++){
//			System.out.print(list[i]+" ");
//		}
		
	}
	@Test
	public void test(){
		int[] list = {9,1,5,8,3,7,4,6,2};
		shellSort(list);
	}
}
