package com.wk.sheji.itertator;
/**
 * 测试迭代器模式
 * @author xwang
 *
 */
public class Client {

	public static void main(String[] args) {
		MyConcrete m = new MyConcrete();
		m.addObject("aa");
		m.addObject("bb");
		m.addObject("cc");
		
		Myitertator k = m.getMyitertator();
		while(k.hasNext()){
			System.out.println(k.getCurrentObj());
			System.out.println(k.isFirst());
			k.next();
		}
	}
}
