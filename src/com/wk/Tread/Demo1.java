package com.wk.Tread;
/**
 * 進程的創建
 * @author xwang
 *
 */
public class Demo1 extends Thread{
	
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("xpss"+i);
		}
	}
}

class Demo2 extends Thread{
	
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("xpssff"+i);
		}
	}
}