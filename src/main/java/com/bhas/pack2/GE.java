package com.bhas.pack2;

import java.time.LocalDateTime;

public class GE implements CGI
{
	@Override
	public void wish(int hour)
	{
		if(LocalDateTime.now().getHour() > 17 || LocalDateTime.now().getHour() < 24)
			System.out.println("\n Good Evening,");
	}
}
