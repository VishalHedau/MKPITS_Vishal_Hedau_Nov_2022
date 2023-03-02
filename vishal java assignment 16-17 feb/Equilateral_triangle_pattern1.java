//Write a program to display EQUILATERAL TRIANGLE with stars.


import java.util.*;
public class Equilateral_triangle_pattern1
{
public static void main(String [] args)
{

Scanner sc = new Scanner(System.in);
System.out.println("Enter the number");
int num = sc.nextInt();

	for(int i=0; i<num; i++)
	{
		for(int j=0; j<num-i-1; j++){

			System.out.print(" ");

			}
		for(int k=0; k<=i; k++){

			System.out.print("V");

			}
			System.out.println( );
	}


}
}
