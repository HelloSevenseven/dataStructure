package com.xxb.search;

import org.junit.Test;

public class BinarySearch {

	public int binarySearch(int[] list, int key){
		int low=0;
		int high = list.length;
		while(low<high){
			int mid = (low+high)/2;
			if(list[mid] == key){
				return mid;
			}else if(list[mid] < key){
				low = mid+1;
			}else {
				high = mid;
			}
		}
		return 0;
	}
	@Test
	public void test(){
		int mouth = 20;
		int[] a = new int[mouth];
		a[0] = 1;
		a[1] = 1;
		a[2] = 1;
		for(int i=3; i<mouth; i++){
			a[i] = a[i-1]+a[i-2]+a[i-3];
			System.out.println("第"+i+"个月的兔子数="+a[i]+"");
		}
	}
}
