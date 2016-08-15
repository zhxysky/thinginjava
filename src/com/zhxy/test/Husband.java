package com.zhxy.test;

public class Husband {

	private String name;
	private int salary;

	private Husband() {
		// TODO Auto-generated constructor stub
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
	
	@Override
	public String toString() {
		return "Husband [name=" + name + ", salary=" + salary + "]";
	}

	public static void main(String[] args) {
		
		//反射机制获取类的三种方法
		
		try {
			Class<Husband> h1 = (Class<Husband>) Class.forName("com.zhxy.test.Husband");
			System.out.println(h1);
		} catch (ClassNotFoundException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		
		Class h2 = Husband.class;
		System.out.println(h2);
		
		Husband h3 = new Husband();
		Class h4 = h3.getClass();
		System.out.println(h4);
		System.out.println(h4.getName());
		
		System.out.println(int.class);
		System.out.println(int[].class.getName());
		System.out.println(Double[].class.getName());
		
		
		try {
			Husband a = Husband.class.newInstance();
			System.out.println(a.toString());
		} catch (InstantiationException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IllegalAccessException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		try {
			Husband c = (Husband) Class.forName("com.zhxy.test.Husband").newInstance();
			System.out.println(c.toString());
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
