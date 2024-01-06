package com.shiva.basicPrograms;

public class VowelsPresent  {

	public static void main(String args[]){
		String name="automation";


for(int i=0;i<name.length();i++)
{
  if( name.charAt(i)=='a'||name.charAt(i)=='e'||name.charAt(i)=='i'||name.charAt(i)=='o'||name.charAt(i)=='u')
  {
      System.out.println("Vowels is "+name.charAt(i)+" at index "+i);
  }
}
}
}
