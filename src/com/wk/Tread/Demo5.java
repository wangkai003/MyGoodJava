package com.wk.Tread;
/**
 * 单例设计模式，确保一个类只有一个对象
 * @author xwang
 *
 */
public class Demo5 {

	public static void main(String[] args) {
		Jvm j1 = Jvm.getInstance();
		Jvm j2 = Jvm.getInstance();
		System.out.println(j1);
		System.out.println(j2);
	}
}
//懒汉式
class Jvm{
	//2.声明一个私有静态变量
	private static Jvm instance = null;
	
	//1.构造器私有化
	private Jvm(){
		
	}
	
	//3.创建一个对外的公共的静态方法访问该变量，如果该变量没有对象，创建该对象。
	public static Jvm getInstance(){
		if(instance==null){
			instance = new Jvm();
		}
		return instance;
	}
	
}
