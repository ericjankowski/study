package com.erj.practice.threads;

public class PlayingWithJoin {
	public static void main(String[] args) {
		System.out.println("Start main");
		Runnable r = new Runnable(){
			public void run(){
				System.out.println("Start R");
				for (int i = 0; i< 1000; i++){
					System.out.println("R");
					try{
						Thread.sleep(1);
					}catch(InterruptedException e){}
				}
				System.out.println("End R");
			}
		};
		Runnable s = new Runnable(){
			public void run(){
				System.out.println("Start S");
				for (int i = 0; i< 1000; i++){
					System.out.println("S");
				}
				System.out.println("End S");
			}
		};
		Thread one = new Thread(r);
		Thread two = new Thread(s);
		one.start();
		two.start();
		try {
			//one.join();
			two.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("End main");
	}
}
