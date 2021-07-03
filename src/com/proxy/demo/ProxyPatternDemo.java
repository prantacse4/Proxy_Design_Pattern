package com.proxy.demo;

public class ProxyPatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Money money = new ProxyCheque(12500);
//		System.out.println("From Cash");
//		money.displayAmount();
//		System.out.println();
//		System.out.println("---------------");
//		money.displayAmount();
		
		
		Money money2 = new Proxy_Conditional(16500);
		System.out.println("From Cash");
		money2.displayAmount();
		System.out.println();
		System.out.println("---------------");
		money2.displayAmount();

	}

}
