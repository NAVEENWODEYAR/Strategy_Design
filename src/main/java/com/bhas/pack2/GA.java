package com.bhas.pack2;

import java.time.LocalDateTime;

public class GA implements CGI
{
	@Override
	public void wish(int hour)
	{
		if(LocalDateTime.now().getHour() > 12 || LocalDateTime.now().getHour() < 17)
			System.out.println("\n Good Afternoon,");
	}

}
