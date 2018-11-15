package com.wk.sheji;
/**
 * 策略设计模式
 * @author xwang
 *
 */
public class Custom3 implements Strategy{

	@Override
	public double getPrice(double price) {
		System.out.println("超级会员用户打8折");
		return price*0.8;
	}

}
