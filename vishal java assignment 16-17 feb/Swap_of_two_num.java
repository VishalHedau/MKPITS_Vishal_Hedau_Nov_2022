//Write a program to Swap two numbers without using 3rd variable.


import java.util.*;

public class Swap_of_two_num
{
public static void main(String [] args)
{
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the first number a = ");
	int a = sc.nextInt();
	System.out.print("Enter the first number b = ");
	int b = sc.nextInt();

	int str;

	str = a;
	a = b;
	b = str;

	System.out.println("a="+a);
	System.out.println("b="+b);




}
}