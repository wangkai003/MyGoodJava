package com.wk.Tread;
/**
 * 測試線程的主類
 * @author xwang
 *
 */
public class Test {

	public static void main(String[] args) {
		//run方法時一個空方法
		/*Demo1 d = new Demo1();
		Demo2 d2 = new Demo2();
		//啟動線程
		d.start();
		d2.start();*/
		Demo3 d = new Demo3();
		Thread t1 = new Thread(d,"xp1ll");
		Thread t2 = new Thread(d,"xp1bbbl");
		Thread t3 = new Thread(d,"xp1mmml"); 
		t1.start();
		t2.start();
		t3.start();
	}
}
