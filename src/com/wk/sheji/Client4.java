package com.wk.sheji;
/**
 * 测试观察者模式
 * @author xwang
 *
 */
public class Client4 {

	public static void main(String[] args) {
		//目标对象
		CusSubject c = new CusSubject();
		//创建目标
		ObserverA o1 = new ObserverA();
		ObserverA o2 = new ObserverA();
		ObserverA o3 = new ObserverA();
		//让这三个观察者对象添加到subject对象的集合中
		c.register(o1);
		c.register(o2);
		c.register(o3);
		c.setState(300);
		System.out.println(o1.getMystate());
		System.out.println(o2.getMystate());
		System.out.println(o3.getMystate());
	}
}
