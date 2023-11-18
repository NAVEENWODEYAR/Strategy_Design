package com.bhas.pack2;

public class Greet 
{
	// interface reference,
		CGI cg = null;
		
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
