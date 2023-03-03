// Write a Java  program to print Hello and your name in a separate line.

import java.util.*;

public class print_name
{
public static void main(String [] args)
{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Your Name : ");
	String name = sc.next();

	System.out.println("Hello");
	System.out.println(name);


}
}