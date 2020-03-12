package Assignments1;

import java.util.Scanner;

public class StringPalindromeOrNot
{

	public static void main(String[] args) 
	{System.out.println("Enter the name:");
	Scanner sc = new Scanner(System.in);
	String name = sc.nextLine();
		
		StringBuffer br = new StringBuffer(name);
		String sr = br.reverse().toString();//in br we have reverse of name 
		for(int i=0;i<name.length();i++)//to check each and every character whether it is palindrome or not for(int i=0;i<=name.length-1();i++)
		{
			int c = (int)name.charAt(i);
			int d = (int)sr.charAt(i);

		
		if(c==d)
		{
			System.out.println("Palindrome");
		}
		else{
			System.out.println("not a palindrome");
		}
		}
		
		
}
}
