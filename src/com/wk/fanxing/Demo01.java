package com.wk.fanxing;

import java.lang.reflect.Method;

/**
 * java的泛型与反射机制
 * @author xwang
 *
 */
public class Demo01 {

	public static void main(String[] args) {
		Gen<Bird> g = new Gen<Bird>(new Bird());
		g.showTypeName();
	}
}

//定义一个Bird
class Bird{
	 public void test(){
		 System.out.println("aa");
	 }
	 public void count(int a,int b){
		 System.out.println(a+b);
	 }
}

//定义一个类
class Gen<T>{
	private T o;
	
	public Gen(T o) {
		super();
		this.o = o;
	}

	//得到T的类型名称
	public void showTypeName(){
		System.out.println(o.getClass().getName());
		//通过反射机制可以得到T的许多信息
		Method[] m = o.getClass().getDeclaredMethods();
		//显示T的方法
		for (Method method : m) {
			System.out.println(method.getName());
		}
	}
}
