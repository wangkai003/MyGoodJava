package com.wk.Tread;
/**
 * 优先级
 * 有三个常量
 * @author xwang
 *
 */
public class Test3 {

	public static void main(String[] args) throws Exception {
		Demo4 d = new Demo4();
		Thread t = new Thread(d,"IT");
		Demo4 d2 = new Demo4();
		Thread t2 = new Thread(d,"IT2");
		t.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.MAX_PRIORITY);
		t.start();
		t2.start();
		
		Thread.sleep(1000);
		d.stop();
		d2.stop();
	}
}
