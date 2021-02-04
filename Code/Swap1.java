import java.util.*;

class Swap1
{  
	public static void main(String args[])  
	{    
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter 1st Number :- ");
		int num1 = sc.nextInt();
		
		System.out.print("Enter 2nd Number :- ");
		int num2 = sc.nextInt();
		
		System.out.println("Before Swap :- ");
		System.out.println("1st Number :- "+num1);
		System.out.println("2nd Number :- "+num2);
		
		
		num1 = num1 + num2;
		num2 = num1 - num2;
		num1 = num1 - num2;
		
		System.out.println("After Swap :- ");
		System.out.println("1st Number :- "+num1);
		System.out.println("2nd Number :- "+num2);
	}
}