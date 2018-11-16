package com.wk.sheji;
/**
 * 模板设计模式，首先定义基本的模板骨架，
 * 其中的具体实现由钩子方法来实现，即类中定义的抽象方法
 * 但方法的逻辑顺序不能够改变，只能够改变方法中的实现
 * @author xwang
 *
 */
//模拟银行业务的实现
public abstract class TemplateMethod {

	//具体的方法
	public void takeNumber(){
		System.out.println("取号排队");
	}
	
	public abstract void toService();//办理的具体的业务
	
	public void evaluate(){
		System.out.println("反馈评分");
	}
	
	public final void process(){ //模板方法
		this.takeNumber();
		this.toService();
		this.evaluate();
	}
}
