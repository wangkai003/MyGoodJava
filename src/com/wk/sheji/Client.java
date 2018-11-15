package com.wk.sheji;

public class Client {

	public static void main(String[] args) {
		Strategy strategy = new Custom();
		Context c = new Context(strategy);
		c.pringPrice(998);
		strategy = new Custom2();
		c = new Context(strategy);
		c.pringPrice(998);
		
	}
}
