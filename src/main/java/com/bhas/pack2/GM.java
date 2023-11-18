package com.bhas.pack2;

import java.time.LocalDateTime;

public class GM implements CGI
{
	@Override
	public void wish(int h)
	{	
		if(LocalDateTime.now().getHour() > 24 || LocalDateTime.now().getHour() < 12)
			System.out.println("\n Good Morning,");
	}
	
}
