package com.wk.Tread;
/**
 * 测试java Thread 中的常用方法
 * @author xwang
 *
 */
public class Demo4 implements Runnable{
	private boolean flag = true;
    private int num  = 0;
	@Override
	public void run() {
		while(flag){
			System.out.println(num++);
			System.out.println(Thread.currentThread().getName());
		}
		
	}
	
	public void stop(){
		this.flag = !this.flag;
	}

}
