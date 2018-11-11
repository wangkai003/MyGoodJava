package com.wk.string;
/**
 * 练习String相关的类
 * @author xwang
 *
 */
public class Demo1 {

	public static void main(String[] args) {
		//可变字符序列 StringBuilder效率高，线程不安全
		StringBuilder sb = new StringBuilder("abc");
		sb.append(true);
		sb.append(true).append("mmkkoooopp").append(23);//方法连
		System.out.println(sb);
		sb.delete(3, 5);//同样可以适用于链式方法
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);//字符串翻转
		
		StringBuffer sf = new StringBuffer();//synchronized 同步
	}
}
