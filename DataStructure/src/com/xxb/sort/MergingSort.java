package com.xxb.sort;

import org.junit.Test;

/**
 * �鲢����
 * �鲢��Merge�������ǽ����������������ϣ������ϲ���һ���µ���������Ѵ��������з�Ϊ���ɸ������У�ÿ��������������ġ�
 * Ȼ���ٰ����������кϲ�Ϊ�����������С�
 * @author лС��
 */
public class MergingSort {
	
	public void merge(int[] list,int low,int mid,int high){
		int[] temp = new int[high-low+1];
		int i = low;
		int j = mid+1;
		int k = 0;
		
		//���Ұ�Ƚ� ���ƽ��С����
		while(i<=mid&&j<=high){
			if(list[i]<list[j]){
				temp[k++] = list[i++];
			}else
				temp[k++] = list[j++];
		}
		//�����ʣ��Ĳ���
		while(i <= mid){
			temp[k++] = list[i++];
		}
		//���ұ�ʣ��Ĳ���
		while(j <= high){
			temp[k++] = list[j++];
		}
		//����list
		for(int s = 0; s<temp.length; k++){
			list[s+low] = temp[s];
		}
		
	}
	public int[] mergingSort(int[] list, int low, int high ){
		int mid = (low+high)/2;
		//�������Ӧ����ôд��
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




