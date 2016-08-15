package com.zhxy.chapter9.interfaces;

import com.zhxy.chapter9.interfaces.N.DImp2;

class N {
	interface B {
		void f();
	}
	
	public class BImp implements B {
		public void f() {
		}
	}
	
	private class BImp2 implements B {
		public void f(){}
	}
	
	public interface C {
		public void f();
	}
	
	class CImp implements C {
		public void f(){}
	}
	
	private class CImp2 implements C {
		public void f(){}
	}
	
	private interface D {
		void f();
	}
	
	private class DImp implements D {
		public void f(){}
	}
	public class DImp2 implements D {
		public void f(){}
	}
	
	public  D getD() {
		return new DImp2();
	}
	
	private D dRef;
	
	public void receiveD (D d) {
		dRef = d;
		dRef.f();
	}
	
}

interface E {
	interface G {
		void f();
	}
	
	public interface H {
		void f();
	}
	
	void g() ;
	
	//Cannot be private within an interface;
//	private interface I{}
}

public class NestingInterfaces {

	public class BImp implements N.B {
		public void f(){}
	}
	
	class CImpl implements N.C {

		@Override
		public void f() {
			// TODO Auto-generated method stub
			
		}
		
	}
	
	//Cannot implement a private interface except within that interface's defining class;
//	class DImp implements A.D {
//		public void f(){}
//	}
	
	class EImp implements E {

		@Override
		public void g() {
			// TODO Auto-generated method stub
			
		}
		
	}
	
	class EGImp implements E.G {

		@Override
		public void f() {
			// TODO Auto-generated method stub
			
		}
		
	}
	
	class EImp2 implements E {
		public void g(){}
		class EG implements E.G {
			public void f(){}
		}
	}
	
	public static void main(String[] args) {
		N n = new N();
		//Can't access N.D:
//		N.D ad = n.getD();

		
		N.DImp2 di2 = (DImp2) n.getD();
		
//		n.getD().f();
		
		N n2 = new N();
		n2.receiveD(n.getD());
		
	}
}
