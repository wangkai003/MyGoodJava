package com.wk.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

/**
 * 字符流的使用
 * @author xwang
 *
 */
public class TestIO8 {

	public static void main(String[] args) {
		//1.创建源
		File f = new File("D:/test2/xp.txt");
		//2.选择流
		Reader reader = null;
		try {
			reader = new FileReader(f);
			//定义一个字符数组用于读取
			char[] c = new char[1024];
			int len = 0;
			while(-1!=(len=reader.read(c))){
				String str = new String(c,0,len);
				System.out.println(str);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			if(reader!=null){
				try {
					reader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
		
	}
}
