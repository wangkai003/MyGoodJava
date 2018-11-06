package com.wk.file;

import java.io.File;

/**
 * 文件夹的拷贝
 * @author xwang
 *
 */
public class TestIO7 {

	public static void main(String[] args) {
		//1，构建要拷贝的文件
		String path ="d:/test";
		//目标目录
		String path2 = "e:";
		File f = new File(path);
		File f2 = new File(path2);
		if(f.isDirectory()){
			f2 = new File(path2,f.getName());
		}
		else if(f.isFile()&&f2.isFile()){
			try {
				TestIO6.copyFile(f, f2);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		copyDir(f,f2);
	}

	private static void copyDir(File f, File f2) {
		 if(f.isFile()){
			 try {
				TestIO6.copyFile(f, f2);
			} catch (Exception e) {
				e.printStackTrace();
			}
		 }else if(f.isDirectory()){
			 //确保目的文件夹的存在
			 f2.mkdirs();
			 for(File f3:f.listFiles()){
				 copyDir(f3,new File(f2,f3.getName()));
			 }
		 }
		
	}
	
	
}
