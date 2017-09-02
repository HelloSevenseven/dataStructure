package com.xxb.offer;

import java.util.Scanner;

import org.junit.Test;

/**
 * 猴子下山摘桃问题
 * @author 谢小波
 */
public class Test01 {

	public void app(int[] list){
		int[] l = new int[list.length];		//表示从任何一棵树开始，它所能摘到的桃子
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
		System.out.println("输了树的数量");
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		int[] list = new int[a]; 
		for(int i = 0; i<a; i++){
			System.out.println("输入第"+i+"棵树的桃子数	");
			list[i] = sc.nextInt();
			
		}
		app(list);
		
	}
	
}
