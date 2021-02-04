
import java.util.*;

class Fib1
{  
	public static void main(String args[])  
	{    
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a Number :- ");
		int num = sc.nextInt();
		
		int n1=0,n2=1,n3 = 0;    
		
		System.out.print(n1+" "+n2);

		while(n3 <= num)
		{    
			n3=n1+n2;  
			if(n3 <= num)
			{
				System.out.print(" "+n3); 
			}				
			n1=n2;    
			n2=n3;    
		}	    
	}
}  