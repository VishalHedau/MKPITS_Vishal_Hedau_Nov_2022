//Write a program to find the FACTORIAL of a given number.

import java.util.*;

public class Factorial_of_n
{
public static void main (String [] args){

	Scanner sc = new Scanner(System.in);
	System.out.print("Enter number : ");
	int num = sc.nextInt();

	int fact=1;

	for(int i=1; i<=num; i++)
	{
		fact = fact*i;

	}
		System.out.println(fact);
}
}