package com.wk.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/**
 * 练习迭代器的使用方法
 * @author xwang
 *
 */
public class Demo01 {

	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
		
		for (Object object : list) {
			System.out.println(object);
		}
		
		Set set = new HashSet();
		set.add("aaa1");
		set.add("bbb1");
		set.add("ccc1");
		Iterator i = set.iterator();
		while (i.hasNext()) {
			String str = (String) i.next();
			System.out.println(str);
		}
	}
}
