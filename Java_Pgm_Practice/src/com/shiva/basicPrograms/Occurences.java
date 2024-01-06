package com.shiva.basicPrograms;

public class Occurences {

	public static void main(String[] args) {
		String input="Shivaaa manin";
		
		int[] occurence=new int[256];
		
		int i;
		
		for(i=0;i<input.length();i++)
		{
			occurence[input.charAt(i)]++;
			
		}
		for(i=0;i<256;i++)
		{
			if(occurence[i]!=0)
					{
						System.out.println((char)i+">>>>>"+occurence[i]);
					}
		}
	}
}
