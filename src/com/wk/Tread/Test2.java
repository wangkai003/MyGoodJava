package com.wk.Tread;
/**
 * 测试java Thread 中的常用方法
 * @author xwang
 *
 * Thraed中的方法
 *  getName //获取线程的名称
 *  setName //设置线程的名称
 *  isAlive //判断线程的状态
 */
public class Test2 {

	public static void main(String[] args) throws InterruptedException {
		Demo4 d = new Demo4();
		Thread t = new Thread(d,"IT");
		System.out.println(t.getName());
		System.out.println(Thread.currentThread().getName());
		t.start();
		System.out.println("启动后的进程的状态："+t.isAlive());
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		d.stop();
		Thread.sleep(200);
		System.out.println("停止后的进程的状态："+t.isAlive());
	}
}
