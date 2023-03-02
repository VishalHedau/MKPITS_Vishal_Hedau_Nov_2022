//Write a program to check the given number is PALINDROME or not..


import java.util.*;

public class pallindrome_check
{
public static void main (String [] args){

	Scanner sc = new Scanner(System.in);
	System.out.print("Enter digit to check pallindrome : ");
	int num = sc.nextInt();

	int tem = num;
	int rev = 0;

	while(num != 0)
	{
		rev = rev*10+(num%10);
		num=num/10;
	}

	if(rev==tem)
	{
	System.out.println(tem+" is pallindrome");
	}else{
	System.out.println(tem+" is not-pallindrome");
	}



}
}