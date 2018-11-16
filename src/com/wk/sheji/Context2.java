package com.wk.sheji;
/**
 * 状态设计模式 的上下文类，
 * 持有被继承的端口
 * @author xwang
 *
 */
public class Context2 {
    private State state;
    
    public void setState(State s){
    	System.out.println("修改状态");
    	state = s;
    	state.handle();
    }
	
}
