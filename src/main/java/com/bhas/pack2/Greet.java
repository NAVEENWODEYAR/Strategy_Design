package com.bhas.pack2;

public class Greet 
{
	// interface reference,
		private CGI cg = null;
		
	// Field Dependency Injection, not recommended,
		public CGI cg1 = new GA();
		
	// Constructor DI,
	public Greet(GA ga)
	{
		this.cg = ga;
	}
	
	// setter DI,
	public void setObj(GM ga)
	{
		this.cg = ga;
	}
	
	public void wish(int i)
	{
		cg.wish(i);
	}
}
