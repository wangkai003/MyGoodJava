package com.wk.sheji;
/**
 * 状态模式 子类
 * @author xwang
 *
 */
public class FreeState implements State{

	@Override
	public void handle() {
        System.out.println("房间空闲！！");
		
	}

}
