package com.wk.file;

import java.io.File;
import java.io.IOException;

/**
 * IO的常用的方法
 * @author xwang
 *
 */
public class TestIO2 {

	public static void main(String[] args) throws IOException, InterruptedException {
		File f = new File("d:/test/2.jpg");
        //1.文件常用的判断方法
		//文件是否存在
		System.out.println(f.exists());
		//文件是否可读，是否可写
		File f2 = new File("D:/test/fruit.jpg");
		System.out.println("文件是否可写"+f2.canWrite()+"文件是否可读"+f2.canRead());
		//没有真实存在的File默认为文件夹
		if(f2.isDirectory()){
			System.out.println("文件夹");
		}else{
			System.out.println("文件");
		}
		//读取文件的大小，为字节数
		System.out.println(f2.length());
		//创建和删除文件
		File f3 = new File("D:/test/a.txt");
		if(!f3.exists()){
			try {
				boolean b = f3.createNewFile();
				System.out.println(b);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}else{
			boolean b2  = f3.delete();
			System.out.println(b2);
		}
		
		//3.有关临时文件的两个静态方法
		File temp = File.createTempFile("tes", ".temp",new File("D:/test"));
		Thread.sleep(2000);
		temp.deleteOnExit();//程序退出时删除
	}

}
