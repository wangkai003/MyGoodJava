package com.wk.sheji;
/**
 * 策略设计模式
 * @author xwang
 *
 */
public class Custom2 implements Strategy{

	@Override
	public double getPrice(double price) {
		System.out.println("高级用户打9折");
		return price*0.9;
	}

}
