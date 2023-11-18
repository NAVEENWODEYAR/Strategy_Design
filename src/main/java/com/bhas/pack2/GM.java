package com.bhas.pack2;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class GM
{
	public void wish()
	{	
		if(LocalDateTime.now().getHour() > 24 || LocalDateTime.now().getHour() < 12)
			System.out.println("\n Good Morning,");
	}
	
	
	
}
