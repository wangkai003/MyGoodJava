package com.wk.GUI;
/**
 * 流式布局
 * @author xwang
 *
 */

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Demo03 extends JFrame{
    //定义需要的组件
	JButton jb1,jb2,jb3,jb4,jb5,jb6;
	
	public static void main(String[] args) {
		Demo03 d = new Demo03();

	}
    //构造函数
	public Demo03(){
		jb1 = new JButton("相朋1");
		jb2 = new JButton("相朋2");
		jb3 = new JButton("相朋3");
		jb4 = new JButton("相朋4");
		jb5 = new JButton("相朋5");
		jb6 = new JButton("相朋6");
		//添加组件
		this.add(jb1);
		this.add(jb2);
		this.add(jb3);
		this.add(jb4);
		this.add(jb5);
		this.add(jb6);
		//设置布局管理器
        this.setLayout(new FlowLayout(FlowLayout.LEFT));
		//
		this.setTitle("流式布局");
		this.setSize(300, 300);
		this.setLocation(200, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//禁止用户改变窗体的大小
		this.setResizable(false);
		this.setVisible(true);
	}
}
