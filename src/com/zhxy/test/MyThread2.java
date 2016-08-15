package com.zhxy.test;

public class MyThread2 implements Runnable {
	
	int i = 100;
	public MyThread2(int i) {
		// TODO Auto-generated constructor stub
		this.i = i;
	}

	@Override
	public void run() {
		try {
			Thread.sleep(i);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		System.out.println(this.i+"\tr1");
		System.out.println(this.i+"\tr2");

	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		Thread t1 = new Thread(new MyThread2(500));
		Thread t2 = new Thread(new MyThread2(1000));
		Thread t3 = new Thread(new MyThread2(2000));
		t1.setDaemon(true);
		t1.start();	
		t2.start();
		t3.start();
		System.out.println("m1");
		t1.join();
		System.out.println("t1");
		t2.join();
		System.out.println("t2");
		t3.join();
		System.out.println("t3");
		System.out.println("m2");
	}

}
