package com.bhas.pack1;

public class Test 
{
	static void strCompare(String st)
	{
		System.out.println("\n String Comparing methods,");
		if("String".equals(st))          // no nullPointer ,
			System.out.println(true);
		else
			System.out.println(false);
	}
	
	static void strCompare1(String st)
	{
		System.out.println("\n SonarCube code review tool,");
		if(st.equals("String"))				// nullPointer Exception may occur
			System.out.println(true);
		else
			System.out.println(false);
	}
	
	public static void main(String[] args) 
	{
		System.out.println("\n*******\n");
		strCompare(null);
		System.out.println("************");
		strCompare1(null);
	}
}
