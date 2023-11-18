package com.bhas.pack2;

import java.time.LocalDateTime;

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
	public void setObj(GA ga)
	{
		this.cg = ga;
	}
	
}
