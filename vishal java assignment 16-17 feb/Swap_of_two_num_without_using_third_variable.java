//Write a program to Swap two numbers without using 3rd variable.


import java.util.*;

public class Swap_of_two_num_without_using_third_variable
{
public static void main(String [] args)
{
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the first number a = ");
	int a = sc.nextInt();
	System.out.print("Enter the first number b = ");
	int b = sc.nextInt();

	a = a+b;	//a = a*b;
	b = a-b;	//b = a/b;
	a = a-b;	//a = a/b;

	System.out.println("a="+a);
	System.out.println("b="+b);


}
}