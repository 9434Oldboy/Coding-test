package com.bjst.kkf;
class F{
	
	public void f()
	{
		System.out.println("woshif");
	}
}


 class  A  extends F implements Test2 {
	public void a() {
		System.out.println("����Aa");
	}
	
	
	public void c() {
		a();
		
	}


	@Override
	public void AA() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void BB() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void CC() {
		// TODO Auto-generated method stub
		
	}


}

 class  M extends A{
	public void a() {
		System.out.println("����Ma");
		
	}
	
	public void  B() {
		System.out.println("����b");
		c();
		a();
		
		super.a();
	}
	public void f()
	{
		System.out.println("woshif2");
	}
	

	
	
	
}
public class Base {
	public static void main(String[] args) {
		A a=new M ();
		a.f();
		
		}
		
		
	


}


