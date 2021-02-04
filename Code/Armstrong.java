
import java.util.*;

public class Armstrong 
{
    public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Number :- ");
		int num = sc.nextInt();
		
        int orgNum, rem, res = 0;

        orgNum = num;
		
		int len = String.valueOf(num).length();
		
        while (orgNum != 0)
        {
            rem = orgNum % 10;
            res += Math.pow(rem, len);
            orgNum /= 10;
        }

        if(res == num)
            System.out.println(num + " is an Armstrong number.");
        else
            System.out.println(num + " is not an Armstrong number.");
    }
}