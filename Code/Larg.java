import java.util.*;

class Larg
{  
	public static void main(String args[])  
	{    
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter 1st Number :- ");
		int num1 = sc.nextInt();
		
		System.out.print("Enter 2nd Number :- ");
		int num2 = sc.nextInt();
		
		if(num1 > num2)
		{
			System.out.println("Largest is :- "+num1);
		}
		else
		{
			System.out.println("Largest is :- "+num2);
		}
	}
}