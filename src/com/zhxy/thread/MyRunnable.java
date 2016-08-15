package com.zhxy.thread;

public class MyRunnable implements Runnable {
	
	private static int i = 0;

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
			System.out.println(i+++"\trun------");
			
		}
	}
	
	public static void main(String[] args) {
//		Runnable r = new MyRunnable();
//		Thread t = new Thread(r);
//		t.setDaemon(true);
//		t.start();
//		System.out.println(t.getPriority());
//		System.out.println(t.getState());
//		System.out.println(t.getState());
//		System.out.println(t.getState());
//		
//		String a = "abc";
		
		System.getProperties().list(System.out);
		System.out.println(System.getProperty("user.name"));
		System.out.println(System.getProperty("java.library.path"));
	}
	

}
