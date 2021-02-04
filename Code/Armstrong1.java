
import java.util.*;

public class Armstrong1 
{
    public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Start Number :- ");
		int num1 = sc.nextInt();
		
		System.out.print("Enter End Number :- ");
		int num2 = sc.nextInt();
		
		boolean flag = true;
		
		while (flag)
		{
			int orgNum, rem, res = 0;

			orgNum = num1;
		
			int len = String.valueOf(num1).length();
		
			while (orgNum != 0)
			{
				rem = orgNum % 10;
				res += Math.pow(rem, len);
				orgNum /= 10;
			}
			
			if(res == num1)
			{
				System.out.println(num1);
			}
			
			if(num1 == num2)
			{
				flag = false;
			}
			
			num1 ++;
		}

        //if(res == num)
          //  System.out.println(num + " is an Armstrong number.");
        //else
         //   System.out.println(num + " is not an Armstrong number.");
    }
}