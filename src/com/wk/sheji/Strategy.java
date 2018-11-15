package com.wk.sheji;
/**
 * 不同的情况设计不同的算法族，即对应不同的实现类
 * @author xwang
 *
 */
public interface Strategy {

	public double getPrice(double price);
}
