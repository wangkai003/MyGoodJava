package com.wk.sheji;

public class CusSubject extends Subject {
	private int state;

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
		//主题对象状态改变，通知所有的观察者对象
		this.notifyAllObserver();
	}

}
