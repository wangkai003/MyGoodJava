package com.wk.sheji;

import java.util.ArrayList;
import java.util.List;

public class Subject {

	protected List<Observer> list = new ArrayList();//包含所有的观察者
	
	public void register(Observer observer){
		list.add(observer);
	}
	
	public void remove(Observer observer){
		list.remove(observer);
	}
	//通知所有的观察者更新状态
	public void notifyAllObserver(){
		for (Observer observer : list) {
			observer.update(this);
		}
	}
}
