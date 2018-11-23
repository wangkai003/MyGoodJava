package com.wk.GUI;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.*;
/**
 * GUI界面编程
 * @author xwang
 *
 */
public class Demo01 {

	public static void main(String[] args) {
		//JFrame是一个顶层容器
		JFrame jf = new JFrame();
		//创建一个按钮
		JButton jb = new JButton("我是按钮");
		jf.setTitle("hello world");
		//设置大小
		jf.setSize(300, 300);
		//设置初始位置
		jf.setLocation(100, 100);
		//添加组件
		jf.add(jb);
		//当关闭窗口时，保证jvm也退出
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setVisible(true);
	}
}
