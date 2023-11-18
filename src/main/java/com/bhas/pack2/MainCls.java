package com.bhas.pack2;

public class MainCls 
{

	public static void main(String[] args) 
	{
		System.out.println("**************");
		
		Greet greet = new Greet(new GA());
				greet.wish(0);
				System.out.println("**********");
				greet.setObj(new GM());
		
	}

}
