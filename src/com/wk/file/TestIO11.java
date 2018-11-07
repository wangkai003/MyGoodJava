package com.wk.file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

/**
 * 使用字符緩衝流處理
 * @author xwang
 *
 */
public class TestIO11 {

	public static void main(String[] args) {
		 File f = new File("d:/test2/xppp.txt");
		 File f2 = new File("d:/test/nn.txt");
		 //Reader r = null;
		 //Writer w = null;
		 /**
		  * 使用新增的方法時應該如下定義
		  * 
		  * BufferedReader r = null;
		  * BufferedWriter w = null;
		  */
		  BufferedReader r = null;
		  BufferedWriter w = null;
		 
		 try {
			r = new BufferedReader(new FileReader(f));
			w = new BufferedWriter(new FileWriter(f2));
			/*char[] c = new char[1024];
			int len = 0;
			while(-1!=(len=r.read(c))){
				w.write(c, 0, len);
			}*/
			//使用新增的方法來處理字符的讀取
			String str = null;
			while(null!=(str = r.readLine())){
				w.write(str);
				w.newLine();//添加換行符
			}
			w.flush();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(w!=null){
				try {
					w.close();
					if(r!=null){
						r.close();
					}
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		 
         
	}

}
