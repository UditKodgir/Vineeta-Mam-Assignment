
import java.util.*;

class PrimeFrom
{
	public static void main (String[] args)
	{	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Start Number :- ");
		int num1 = sc.nextInt();
		System.out.print("Enter End Number :- ");
		int num2 = sc.nextInt();
	
		int i =0;
		int num =0;
		String  primeNumbers = "";

		for (i = num1; i <= num2; i++)         
		{ 		  	  
			int counter=0; 	  
			for(num =i; num>=1; num--)
			{
				if(i%num==0)
				{
					counter = counter + 1;
				}
			}
	  
			if (counter ==2)
			{
				primeNumbers = primeNumbers + i + " ";
			}	
		}	
		System.out.println("Prime numbers from "+num1+" to "+num2+" are :-");
		System.out.println(primeNumbers);
   }
}