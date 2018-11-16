package com.wk.sheji.itertator;
/**
 * 设计一个迭代器，使用迭代模式
 * @author xwang
 *
 */
public interface Myitertator {
      void first(); //将游标指向第一个
      void next(); //将游标指向最后一个
      boolean hasNext();//判断是否存在下一个元素
      boolean isFirst();
      boolean isLast();
      Object getCurrentObj();//获取当前游标指向的对象
}
