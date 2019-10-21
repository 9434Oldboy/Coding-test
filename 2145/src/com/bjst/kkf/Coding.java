package com.bjst.kkf;
class SB {
	int M=100;
	void sn() {
		int M=50;
		System.out.println(M);
		System.out.println(this.M);
		
	}
}

public class Coding {
	public static void main(String[] args) {
	SB sb=new SB();
	sb.sn();
	}

}
