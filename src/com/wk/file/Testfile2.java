package com.wk.file;

import java.io.File;

/**
 * 递归显示指定目录和其子目录的文件
 * @author xwang
 *
 */
public class Testfile2 {

	public static void main(String[] args) {
		
        File f = new File("D:/nodejs");
        printFile(f, 0);
	}
	
	//递归体
	static void printFile(File file,int level){
		System.out.println(file.getName());
		for (int i = 0; i < level; i++) {
			System.out.print("->");
		}

		if(file.isDirectory()){
			File [] foles = file.listFiles();
			for (File file2 : foles) {
				printFile(file2, level+1);
			}
		}
	}

}
