package com.erj.practice.threads;

// taken from OCP book, page 724
public class ManyNames {
	public static void main(String [] args){
		NameRunnable nr = new NameRunnable();
		Thread one = new Thread(nr);
		Thread two = new Thread(nr);
		Thread three = new Thread(nr);
		
		one.setName("Fred");
		two.setName("Lucy");
		three.setName("Ricky");
		
		one.start();
		two.start();
		three.start();
	}
}

class NameRunnable implements Runnable{
	public void run(){
		for (int x = 1; x<=3; x++){
			System.out.println("Run by " + Thread.currentThread().getName() + ", x is " + x);
		}
	}
}

/* 
 
First run output :
Run by Lucy, x is 1
Run by Ricky, x is 1
Run by Fred, x is 1
Run by Ricky, x is 2
Run by Ricky, x is 3
Run by Lucy, x is 2
Run by Fred, x is 2
Run by Lucy, x is 3
Run by Fred, x is 3

Second run:
Run by Lucy, x is 1
Run by Ricky, x is 1
Run by Fred, x is 1
Run by Ricky, x is 2
Run by Lucy, x is 2
Run by Ricky, x is 3
Run by Fred, x is 2
Run by Lucy, x is 3
Run by Fred, x is 3

Third run:
Run by Ricky, x is 1
Run by Ricky, x is 2
Run by Fred, x is 1
Run by Lucy, x is 1
Run by Lucy, x is 2
Run by Fred, x is 2
Run by Ricky, x is 3
Run by Fred, x is 3
Run by Lucy, x is 3

*/
