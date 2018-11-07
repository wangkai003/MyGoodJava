package com.wk.Tread;
/**
 * 利用靜態代理實現多線程，并且實現runable接口
 * @author xwang
 *
 */
public class Demo3 implements Runnable{
    private int n = 50;
	
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			if(n<0){
				break;
			}
			System.out.println("vvv"+n+"--》"+Thread.currentThread().getName());
			n--;
		}
		
	}

}
