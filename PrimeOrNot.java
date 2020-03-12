package Assignments1;

public class PrimeOrNot
{    
	 public static void main(String args[])
 {    
	  int i,a=0;
	  boolean prime=true;
	  int n = Integer.parseInt(args[0]);//it is the number to be checked    
	  a=n/2;      
	  if(n==0||n==1){  
	   System.out.println(n+" is not prime number");      
	  }
	  else
	  {  
	   for(i=2;i<=a;i++)
	   {      
	    if(n%i==0)
	      prime=false;
	   }      
	    
	  }//end of else  
	  if(prime)
	  {
		  System.out.println(n + " is prime");
	  }
	  else{
		  System.out.println(n+" is not a prime");
	  }
 }    
}   