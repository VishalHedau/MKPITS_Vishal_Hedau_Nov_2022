//Write a program to REVERSE the number.

import java.util.*;

public class reverse_the_num
{
public static void main(String [] args)
{
	Scanner sc = new Scanner(System.in);
	System.out.print("enter number to reverse : ");
	int num = sc.nextInt();

	int tem = num;

	int rev=0;

	while(num!=0)
	{
		rev = rev*10+(num%10);
		num = num/10;
	}
	System.out.println(rev);
}
}