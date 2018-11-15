package com.wk.collection;

import java.util.HashSet;
import java.util.Set;

/**
 * 练习测试集合Set的使用方法
 * @author xwang
 *
 */
public class TestSet {

	public static void main(String[] args) {
		//HashSet的使用方法
		Set set = new HashSet();
		set.add("aaa");
		set.add("bbb");
		set.add(new String("aaa"));
		System.out.println(set.size());
	}
}
