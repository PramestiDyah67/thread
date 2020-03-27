package com.d3ti.pbolanjt20.thread;

public class ThreadInterface extends mainThread implements Runnable{
	String name;
	public ThreadInterface(String name) {
			this.name=name;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		jalan(name);
	}
	
}