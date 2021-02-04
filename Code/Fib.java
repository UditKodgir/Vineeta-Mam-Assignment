
import java.util.*;

class Fib
{  
	public static void main(String args[])  
	{    
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a Number :- ");
		int num = sc.nextInt();
		
		int n1=0,n2=1,n3,i;    
		
		System.out.print(n1+" "+n2);
    
		for(i=2;i<num;++i)
		{    
			n3=n1+n2;    
			System.out.print(" "+n3);    
			n1=n2;    
			n2=n3;    
		}	    
	}
}  