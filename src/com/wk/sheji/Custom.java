package com.wk.sheji;
/**
 * 策略设计模式
 * @author xwang
 *
 */
public class Custom implements Strategy{

	@Override
	public double getPrice(double price) {
		System.out.println("普通用户不打折");
		return price;
	}

}
