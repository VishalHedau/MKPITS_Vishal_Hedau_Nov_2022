//Write a program to display MULTIPLICATION table.

import java.util.*;

public class mul_table
{
public static void main(String [] args){

	Scanner sc = new Scanner(System.in);
	System.out.print("Enter number : ");
	int num = sc.nextInt();

	int mul;


	for(int i=1; i<=10; i++)
	{
		mul = num * i;
		System.out.println(mul);
	}






}
}