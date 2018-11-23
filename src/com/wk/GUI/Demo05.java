package com.wk.GUI;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * 多种布局的综合使用
 * @author xwang
 *
 */
public class Demo05 extends JFrame{

	//定义组件
	JPanel jp1,jp2;
	JButton jb1,jb2,jb3,jb4,jb5,jb6;
	
	public static void main(String[] args) {
		Demo05 d = new Demo05();
	}
	//构造函数
	public Demo05(){
		//创建组件 JPanel默认为流布局
		jp1 = new JPanel();
		jp2 = new JPanel();
		jb1 = new JButton("dd");
		jb2 = new JButton("vv");
		jb3 = new JButton("mm");
		jb4 = new JButton("kk");
		jb5 = new JButton("ll");
		jb6 = new JButton("oo");
		jp1.add(jb1);
		jp1.add(jb2);
		jp2.add(jb3);
		jp2.add(jb4);
		jp2.add(jb5);
		this.add(jp1,BorderLayout.NORTH);
		this.add(jb6);
		this.add(jp2,BorderLayout.SOUTH);
		this.setTitle("布局演示");
		this.setSize(300, 300);
		this.setLocation(200, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}
