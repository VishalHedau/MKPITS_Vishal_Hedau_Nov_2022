// Write a C program to to test if a given non-negative number is a multiple of 13 or it is one more than a multiple of 13.

import java.util.*;

class multiple_of_13{

public static void main(String [] args){

Scanner sc  = new Scanner(System.in);

System.out.println("enter the num");
int a = sc.nextInt();

if(a>0){

if(a%13==0){

	System.out.println("It is a multiple of 13");

	}
else{

		System.out.println("Not a multiple of 13");

	}

}
else {

	System.out.println("NUm should be greater that zero");

	}

}

}
