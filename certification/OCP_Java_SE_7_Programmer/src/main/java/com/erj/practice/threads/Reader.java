package com.erj.practice.threads;

public class Reader extends Thread{
	Calculator c;
	String name;
	
	public Reader (String name, Calculator c){
		this.c = c;
		this.name = name;
	}
	
	public void run(){
		synchronized(c){
			try{
				System.out.println(name + " waiting for calculation...");
				c.wait();
			}catch(InterruptedException e){
				System.out.println(name + " Interrupted Total is: " + c.getTotal());
			}
//			c.notifyAll();
			System.out.println(name + " Out of synch block Total is: " + c.getTotal());
		}
		System.out.println(name + " Done Total is: " + c.getTotal());
	}
	
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		new Reader("Reader One", calculator).start();
		new Reader("Reader Two", calculator).start();
		new Reader("Reader Three", calculator).start();
		new Reader("Reader Four", calculator).start();
//		new Reader("Reader Five", calculator).start();
//		new Reader("Reader Six", calculator).start();
//		new Reader("Reader Seven", calculator).start();
//		new Reader("Reader Eight", calculator).start();
//		new Reader("Reader Nine", calculator).start();
//		new Reader("Reader Ten", calculator).start();
//		new Reader("Reader Eleven", calculator).start();
//		new Reader("Reader Twelve", calculator).start();
//		new Reader("Reader Thirteen", calculator).start();
//		new Reader("Reader Fourteen", calculator).start();
//		new Reader("Reader Fifteen", calculator).start();
//		new Reader("Reader Sixteen", calculator).start();
		new Thread(calculator).start();
	}
}

class Calculator implements Runnable{
	int total;
	
	public int getTotal(){
		return total;
	}
	
	public void run(){
		synchronized(this){
			for(int i = 0; i < 100; i++){
				total += i;
			}
			notifyAll();
		}
	}
}

