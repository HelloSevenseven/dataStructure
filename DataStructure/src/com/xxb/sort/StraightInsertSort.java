package com.xxb.sort;

import org.junit.Test;

/**
 * ֱ�Ӳ�������
 * ˼·������˳���С���뵽ǰ���Ѿ�����������еĺ���λ�ã��Ӻ���ǰ�ҵ�����λ�ú󣩣�ֱ��ȫ������������Ϊֹ��
 * ʱ�临�Ӷ�  O(n2)
 * @author лС��
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
