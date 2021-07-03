package com.proxy.demo;

public class ProxyCheque implements Money{
	private int total;
	private RealCash real_cash;

	public ProxyCheque(int total) {
		super();
		this.total = total;
	}

	@Override
	public void displayAmount() {
		// TODO Auto-generated method stub
		if(real_cash == null) {
			System.out.println("RealCash is not available");
			real_cash = new RealCash(total);
		}
		real_cash.displayAmount();
		
		
		
	}
	
	
}
