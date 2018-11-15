package com.wk.collection;

import java.util.HashMap;

/**
 * 自定义实现HashSet
 * @author xwang
 *
 */
public class MySet {

	HashMap map ;
	private static final Object PRESENT = new Object();
	
	public MySet(){
		map = new HashMap();
	}
	
	public void add(Object o){
		map.put(o, PRESENT);
	}
	
	public int size(){
		return map.size();
	}
	
	public void remove(Object o){
		map.remove(o);
	}
	
	public static void main(String[] args) {
		MySet s = new MySet();
		s.add("bbb");
		s.add("aaa");
		s.add(new String("aaa"));
		System.out.println(s.size());
	}
}
