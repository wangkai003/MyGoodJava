package com.wk.sheji.itertator;

import java.util.ArrayList;
import java.util.List;

/**
 * 迭代器模式
 * 自定义的聚合类
 * @author xwang
 *
 */
public class MyConcrete {
    private List<Object> list = new ArrayList();
    
    //容器中添加对象
	public void addObject(Object o){
		this.list.add(o);
	}
	
	public void removeObject(Object o){
		this.list.remove(o);
	}

	public List<Object> getList() {
		return list;
	}

	public void setList(List<Object> list) {
		this.list = list;
	}
	
	public Myitertator getMyitertator(){
		return new CusIterrator();
	}
	
	//使用内部类定义迭代器
	private class CusIterrator implements Myitertator{
		private int cursor; //定义一个游标

		@Override
		public void first() {
			
			cursor = 0;
		}

		@Override
		public void next() {
			if(cursor<list.size()){
				cursor++;
			}
			
		}

		@Override
		public boolean hasNext() {
			if(cursor<list.size()){
				return true;
			}
			return false;
		}

		@Override
		public boolean isFirst() {
			return cursor==0;
		}

		@Override
		public boolean isLast() {
			return cursor==(list.size()-1);
		}

		@Override
		public Object getCurrentObj() {
			return list.get(cursor);
		}
		
	}
}
