package com.wk.GUI;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 * 常用组件
 * @author xwang
 *
 */
public class Demo06 extends JFrame{

	//定义组件
	JPanel jp1,jp2,jp3;
	JLabel jlb1,jlb2;
	JButton jb1,jb2;
	JTextField jtf1;
	JPasswordField jpf;
	public static void main(String[] args) {
		Demo06 d = new Demo06();
	}
	public Demo06(){
		jp1 = new JPanel();
		jp2 = new JPanel();
		jp3 = new JPanel();
		
		jlb1 = new JLabel("用户名");
		jlb2 = new JLabel("密    码");
		
		jb1 = new JButton("登录");
		jb2 = new JButton("取消");
		
		jpf = new JPasswordField(10);
		jtf1 = new JTextField(10);
		
		//设置布局管理
		this.setLayout(new GridLayout(3, 1));
		jp1.add(jlb1);
		jp1.add(jtf1);
		jp2.add(jlb2);
		jp2.add(jpf);
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
