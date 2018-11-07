package com.wk.Tread;
/**
 * 測試線程的主類
 * @author xwang
 *
 */
public class Test {

	public static void main(String[] args) {
		//run方法時一個空方法
		Demo1 d = new Demo1();
		Demo2 d2 = new Demo2();
		//啟動線程
		d.start();
		d2.start();
	}
}
