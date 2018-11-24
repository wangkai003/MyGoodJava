package com.wk.GUI;

import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * java绘图原理
 * @author xwang
 *
 */
public class Demo08 extends JFrame{

	MyPanle mp = null;
	public static void main(String[] args) {
		Demo08 d = new Demo08();
	}
	public Demo08(){
		mp = new MyPanle();
		this.add(mp);
		this.setSize(400, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}
//定义一个新的面板(用于绘图的区域)
class MyPanle extends JPanel{
	//覆盖JPanel 的paint方法
	//Graphics 是绘图中的画笔类
	public void paint(Graphics g){
		//1.调用父类函数完成初始化
		super.paint(g);
		//开始画图
		g.drawOval(10, 10, 30, 30);
		
	}
}
