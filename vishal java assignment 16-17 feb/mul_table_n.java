//Write a program to display MULTIPLICATION table.

import java.util.*;

public class mul_table_n
{
public static void main(String [] args){

	Scanner sc = new Scanner(System.in);
	System.out.print("Enter number : ");
	int n= sc.nextInt();
	enum (num)=n.Integer;



	for(int i=1; i<=n; i++)
		for(int j=1; j<=10; j++)
		{
			System.out.print(j+"*"+i+"="+j*i+"\t");
		}

	}






}
}