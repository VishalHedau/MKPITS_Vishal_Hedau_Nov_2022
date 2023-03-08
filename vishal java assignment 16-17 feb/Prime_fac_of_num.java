// write a java programme to find prime factor of a number.
import java.util.*;

public class Prime_fac_of_num
{
public static void main(String [] args){

	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the number : ");
	int number = sc.nextInt();

	for(int i=2;i<number;i++)
	{
		while(number%i==0)
		{
		System.out.println(i+"");
		number=number/i;
		}
	}
	if(number>2)
	{
	System.out.println(number);
	}

}
}