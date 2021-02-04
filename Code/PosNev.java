
import java.util.*;

public class PosNev 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a Number :- ");
		int num = sc.nextInt();
		
		if(num >= 0)
			System.out.println(num + " is a Postive number.");
		else
			System.out.println(num + " is a Negative number.");
	}
}