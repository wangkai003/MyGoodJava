package com.wk.GUI;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * 网格布局演示
 * @author xwang
 *
 */
public class Demo04 extends JFrame {
	int size = 9;
	JButton[] jbs = new JButton[size];
	public static void main(String[] args) {
		Demo04 d = new Demo04();
	}
	
	public Demo04(){
		for(int i=0;i<size;i++){
			jbs[i] = new JButton(String.valueOf(i));
		}
		this.setLayout(new GridLayout(3,3,10,10));
		for(int i=0;i<size;i++){
			this.add(jbs[i]);
		}
		this.setTitle("网格布局演示");
		this.setSize(300, 300);
		this.setLocation(200, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}
