package com.wk.file;

import java.io.File;

/**
 * 学习java的IO常量
 * 路径分隔符，文件分割符 /  \
 * @author xwang
 *
 */
public class TestIO {

	public static void main(String[] args) {
		
         System.out.println(File.pathSeparator);
         System.out.println(File.separator);
         
         //相对路径与绝对路径创建File对象
         //1.以父路径构建
         String parentPath = "d:/test";
         String name = "1.png";
         File f = new File(parentPath,name);
         File f2 = new File(new File(parentPath),name);
         System.out.println(f2.getName());
         System.out.println(f2.getPath());
         //2.只传入文件名称，则在当前的工作目录下创建文件
         File f3 = new File("test.txt");
         System.out.println(f3.getPath()+"--"+f3.getParent());
         //输出绝对路径
         System.out.println(f3.getAbsolutePath());
	}

}
