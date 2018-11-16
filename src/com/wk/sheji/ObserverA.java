package com.wk.sheji;
/**]
 * 观察者实例对象
 * @author xwang
 *
 */
public class ObserverA implements Observer{
    private int mystate;//跟目标对象保持一致
	
	@Override
	public void update(Subject subject) {
		mystate = ((CusSubject)subject).getState();
				
	}

	public int getMystate() {
		return mystate;
	}

	public void setMystate(int mystate) {
		this.mystate = mystate;
	}
	
	

}
