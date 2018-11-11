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
		sb.append(true).append("mmkk").append(23);//方法连
		System.out.println(sb);
	}
}
