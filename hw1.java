import java.util.*;
public class hw1
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two values ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int add=a+b;
		int sub=a-b;
		int mul=a*b;
		int div=a/b;
		int rem=a%b;
		System.out.println("Result");
		System.out.println("Addition is " + add);
		System.out.println("Subtraction is " + sub);
		System.out.println("Multiplication is " + mul);
		System.out.println("Division is " + div);
		System.out.println("Remainder is " + rem);
		System.out.println("Enter the number of month ");
		int month=sc.nextInt();
		switch(month)
		{
		case 1:System.out.println("January");
		break;
		case 2:System.out.println("February");
		break;
		case 3:System.out.println("March");
		break;
		case 4:System.out.println("April");
		break;
		case 5:System.out.println("May");
		break;
		case 6:System.out.println("June");
		break;
		case 7:System.out.println("July");
		break;
		case 8:System.out.println("August");
		break;
		case 9:System.out.println("September");
		break;
		case 10:System.out.println("October");
		break;
		case 11:System.out.println("November");
		break;
		case 12:System.out.println("December");
		break;
		default:System.out.println("Invalid number");
		}
	}
}