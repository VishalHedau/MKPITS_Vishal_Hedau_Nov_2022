// 4) Write a program to check given number is EVEN or ODD.

import java.util.*;

public class Even_Odd_Check
{
public static void main(String [] args)
{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number");
	int num = sc.nextInt();
	
	if(num%2==0)
	{
		System.out.println(num+" is EVEN number");
	}else{
		System.out.println(num+" is ODD number");
	}

}
}