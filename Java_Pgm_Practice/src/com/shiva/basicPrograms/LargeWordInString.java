package com.shiva.basicPrograms;

public class LargeWordInString {

	public static void main(String[] args) {
		String inputString ="Automationjghhfghkfg javaWithSeleniumhbhggvjg";
		
		String words[]=inputString.split("\\s");
		String firstword=words[0];
		String infirst="";
		int max=0;
		
		for(int i=0;i<words.length;i++)
		{
			if(words[i].length()>max)
			{
				max=words[i].length();
				infirst=words[i];
			}
		}
		System.out.println(infirst);
}
}
