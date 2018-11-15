package com.wk.sheji;

/**
 * 策略模式的上下文类，用来管理不同的算法策略
 * 
 * @author xwang
 *
 */
public class Context {
	private Strategy strategy;// 当前采用的算法的对象
	// 构造器注入

	public Context(Strategy strategy) {
		super();
		this.strategy = strategy;
	}

	public void setStrategy(Strategy strategy) {
		this.strategy = strategy;
	}
	
	public void pringPrice(double s){
		System.out.println("您的报价"+strategy.getPrice(s));
	}

}
