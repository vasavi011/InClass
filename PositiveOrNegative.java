package Assignment2;

public class PositiveOrNegative {

	public static void main(String[] args) 
	{
System.out.println("Enter a number " +args[0]);
int n = Integer.parseInt(args[0]);//string to int
if(n > 0)
{
	System.out.println("Given number is positive");
}else{
	System.out.println("Given Number is negative");
}
	}

}
