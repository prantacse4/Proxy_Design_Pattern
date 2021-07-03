package com.proxy.demo;

public class Proxy_Conditional implements Money {
	private int total;
	private RealCash real_cash;
	private boolean can_transact = false;
	
	public Proxy_Conditional(int total) {
		super();
		
		this.total = total;
		
		if(total>15000) {
			can_transact = true;
			
		}
	}

	@Override
	public void displayAmount() {
		// TODO Auto-generated method stub
		if(real_cash == null) {
			System.out.println("RealCash is not available");
			real_cash = new RealCash(total);
		}
		if(can_transact == true) {
			System.out.println("Can Transact");
			real_cash.displayAmount();
		}
		if(can_transact == false) {
			System.out.println("Can not Transact");

		}
		
		
		
		
	}
}
