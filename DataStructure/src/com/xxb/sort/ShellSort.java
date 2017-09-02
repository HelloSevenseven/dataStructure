package com.xxb.sort;

import org.junit.Test;

/**
 * ϣ�����򣨲�������
 * ʱ�临�Ӷ� O(n3/2)
 * ˼·���Ƚ�����������ļ�¼���зָ��Ϊ���������зֱ����ֱ�Ӳ�������
 * 		�����������еļ�¼����������ʱ���ٶ�ȫ���¼��������ֱ�Ӳ�����������ܽ���ֱ�Ӳ�����������ΪincrementΪ1�ˣ���
 * @author лС��
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
