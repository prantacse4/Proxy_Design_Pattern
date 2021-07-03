package com.proxy.demo;

public class RealCash implements Money{
	private int total;

	public RealCash(int total) {
		super();
		this.total = total;
		displayThisCash(total);
	}

	@Override
	public void displayAmount() {
		// TODO Auto-generated method stub
		
		System.out.println("Display amount = "+total);
		
	}
	
	public void displayThisCash(int total) {
		System.out.println("Loading.... Real Amount Cash = "+total);
	}
	
	
	
	
	
	
}
