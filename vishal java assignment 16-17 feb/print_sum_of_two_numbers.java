//Write a Java  program to print the sum of two numbers.

import java.util.*;

public class print_sum_of_two_numbers{
public static void main(String [] args){

	Scanner sc = new Scanner(System.in);
	System.out.print("Enter 1st number : ");
	int n1 = sc.nextInt();
	System.out.print("Enter 1st number : ");
	int n2 = sc.nextInt();

	int sum = n1 + n2;
	System.out.println("The sum of two numbers is "+sum);
}
}