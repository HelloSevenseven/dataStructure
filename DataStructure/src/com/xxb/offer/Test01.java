package com.xxb.offer;

import java.util.Scanner;

import org.junit.Test;

/**
 * ������ɽժ������
 * @author лС��
 */
public class Test01 {

	public void app(int[] list){
		int[] l = new int[list.length];		//��ʾ���κ�һ������ʼ��������ժ��������
		int temp = 0;
		for(int i=0; i<list.length; i++){
			for(int j = i; j<list.length; j++){
				if(j+1<list.length){
					if(j==list.length-1&&list[j]<=list[j+1]){
						l[i] = ++temp;
						continue;
					}else if(list[j]<=list[j+1]){

						l[i] = temp++;
						
					}else
						break;
				}
				System.out.println(l[i]);
			}
		}
		for(int a=0; a<l.length; a++){
			if(temp<l[a]){
				temp=l[a];
			}
		}
		System.out.println(temp);
	}
	
	@Test
	public void test(){
		
		int a;
		System.out.println("������������");
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		int[] list = new int[a]; 
		for(int i = 0; i<a; i++){
			System.out.println("�����"+i+"������������	");
			list[i] = sc.nextInt();
			
		}
		app(list);
		
	}
	
}
