package com.wk.GUI;

import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

/**
 * 单选框和复选框实例
 * @author xwang
 *
 */
public class Demo07 extends JFrame{

	//定义
	JPanel jp1,jp2,jp3;
	JLabel jl1,jl2;
	JButton jb1,jb2;
	JCheckBox jcb1,jcb2,jcb3;
	JRadioButton jrb1,jrb2;
	ButtonGroup bg;
	
	public static void main(String[] args) {
		Demo07 d = new Demo07();
	}
	
	//构造
	public Demo07(){
		jp1 = new JPanel();
		jp2 = new JPanel();
		jp3 = new JPanel();
		jl1 = new JLabel("你喜欢的运动");
		jl2 = new JLabel("你的性别");
		jb1 = new JButton("注册用户");
		jb2 = new JButton("取消注册");
		jcb1 = new JCheckBox("足球");
		jcb2 = new JCheckBox("篮球");
		jcb3 = new JCheckBox("网球");
		jrb1 = new JRadioButton("男");
		jrb2 = new JRadioButton("女");
		bg = new ButtonGroup();
		bg.add(jrb1);
		bg.add(jrb2);
		//布局
		this.setLayout(new GridLayout(3,1));
		jp1.add(jl1);
		jp1.add(jcb1);
		jp1.add(jcb2);
		jp1.add(jcb3);
		jp2.add(jl2);
		jp2.add(jrb1);
		jp2.add(jrb2);
		jp3.add(jb1);
		jp3.add(jb2);
		
		this.add(jp1);
		this.add(jp2);
		this.add(jp3);
		

		this.setTitle("布局演示");
		this.setSize(300, 150);
		this.setLocation(200, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true); 
	}
}
