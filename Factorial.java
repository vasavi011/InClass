package Assignment2;

public class Factorial {

	public static void main(String[] args)
	{
		System.out.println(args[0]);
		int n = Integer.parseInt(args[0]);
		int fact=0,i=1;
		do{
			fact = n*(n-1);
			i++;
		}
		while(n>i);
		
		System.out.println("factorial of given number is "+fact);
	}

}
