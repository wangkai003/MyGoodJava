package com.wk.sheji;
/**
 * 测试模板方法
 * @author xwang
 *
 */
public class Client2 {

	public static void main(String[] args) {
		TemplateMethod t = new DrawMoney();
		t.process();//调用模板方法
		
		//有时经常采用匿名内部类
		TemplateMethod t2 = new TemplateMethod() {	
			@Override
			public void toService() {
				System.out.println("我要存款");
				
			}
		};
		t2.process();
	}
}

/**
 * 每一具体的子类对应具体的一种业务，如取款或者转账
 */
class DrawMoney extends TemplateMethod{

	@Override
	public void toService() {
		System.out.println("我要取款！!!");
		
	}
	
}
