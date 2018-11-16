package com.wk.sheji;
/**
 * 测试状态设计模式
 * @author xwang
 *
 */
public class Client3 {

	public static void main(String[] args) {
		Context2 c =new Context2();
		c.setState(new FreeState());//设置为空闲状态
		
	}
}
