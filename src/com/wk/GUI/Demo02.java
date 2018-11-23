package com.wk.GUI;

import java.awt.BorderLayout;
import java.awt.HeadlessException;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * 布局管理器
 * 1.继承JFrame
 * 2.定义需要的组件
 * 3.创建组件
 * 4.添加组件
 * @author xwang
 *
 */
public class Demo02 extends JFrame{
    //定义组件
	JButton jb1,jb2,jb3,jb4,jb5;
	
	public static void main(String[] args) {
		Demo02 d = new Demo02();
	}

	public Demo02(){
		//3.创建组件
		jb1 = new JButton("按钮1");
		jb2 = new JButton("按钮2");
		jb3 = new JButton("按钮3");
		jb4 = new JButton("按钮4");
		jb5 = new JButton("按钮5");
		//添加组件
		this.add(jb1,BorderLayout.CENTER);
		this.add(jb2,BorderLayout.NORTH);
		this.add(jb3,BorderLayout.SOUTH);
		this.add(jb4,BorderLayout.EAST);
		this.add(jb5,BorderLayout.WEST);
		//设置窗体
		this.setTitle("布局案例");
		this.setSize(300, 300);
		this.setLocation(200, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
}
