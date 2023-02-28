//6) Write a program to check whether the given number is PRIME or not.

import java.util.*;

public class Check_prm_or_not
{
public static void main(String [] args)
{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number");
	int num = sc.nextInt();
	int i;

	if(num == 1)
	{
		System.out.println("Prime numbers start from 2");
		}
		for(i=2; i<num; i++)
		{
			if(num%i==0){
					System.out.println(num+" is not a prime number");
					break;
				}
		}
	if(num == i)
	{
		System.out.println(num+" is a Prime number");
		}

}
}