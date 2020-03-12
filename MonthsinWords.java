package Assignments1;

public class MonthsinWords {
	public static void main(String[] args) 
	{
		System.out.println("Enter month in Numbers " +args[0]);
		int n=Integer.parseInt(args[0]);
		switch(n)
		{
		case 1 : System.out.println("Jan");
		break;
		case 2 : System.out.println("Feb");
		break;
		case 3 : System.out.println("March");
		break;
		case 4 : System.out.println("Apr");
		break;
		case 5 : System.out.println("May");
		break;
		case 6 : System.out.println("June");
		break;
		case 7 : System.out.println("July");
		break;
		case 8 : System.out.println("August");
		break;
		case 9 : System.out.println("September");
		break;
		case 10 : System.out.println("October");
		break;
		case 11 : System.out.println("Nov");
		break;
		case 12 : System.out.println("Dec");
		break;
		default:System.out.println("Enter valid number only");
		
		}
	}

}
