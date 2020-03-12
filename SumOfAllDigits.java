package Assignments1;

import java.util.Scanner;

public class SumOfAllDigits 
{

	public static void main(String[] args) 
	{
		System.out.println("Enter the numbers");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int num = Integer.parseInt(str);
		if(str.length()>4)
		{
			System.out.println("enter only 4 digits");
		}else{
	
		int sum=0,r;
		while(num>0)
			{
				r=num%10;
				sum = sum+r;
				num=num/10;
			}
		System.out.println(sum);
	}
	}
}
