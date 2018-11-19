package com.wk.text;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

/**
 * 测试java使用javaScript脚本引擎
 * @author xwang
 *
 */
public class Demo01 {

	public static void main(String[] args) throws Exception {
		//获得脚本引擎对象
		ScriptEngineManager s = new ScriptEngineManager();
		ScriptEngine engine = s.getEngineByName("javascript");
		
		//定义变量
		engine.put("msg", "xpssl ff");
		String str = "var user = {name:'tom',age:18};";
		str += "print(user.name);";
		//执行脚本
		engine.eval(str);
	}
}
