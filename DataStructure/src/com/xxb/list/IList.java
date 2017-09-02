package com.xxb.list;

/*
 * 线性表的接口
 */
public interface IList {

	void InitList(); // 建立一个空的线性表
	
	void ListEmpty();  // 判断线性表是否为空
	
	void ClearList();  //清空线性表
	
	void GetElem();  //获得元素
	
	void LocateElem();//  查询表中的元素
}
