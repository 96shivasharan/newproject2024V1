package com.shiva.basicPrograms;

public class ReverseStringWithoutUsingInbuiltMethod {

	public static void main(String[] args) {
		
		String name="Shiva";
		String reverse="";
		
		for(int i=0;i<=name.length()-1;i++)
		{
			char c=name.charAt(i);
			reverse=c+reverse;
			
		}
		System.out.println(reverse);

	}

}
