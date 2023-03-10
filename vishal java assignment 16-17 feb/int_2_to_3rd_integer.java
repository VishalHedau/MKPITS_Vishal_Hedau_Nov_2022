// Write a java program to check if it is possible to add two integers to get the third integer from three given integers.

import java.util.*;

class int_2_to_3rd_int_bclass{

public void  int_to_get_3rd(){

Scanner cs = new Scanner(System.in);

System.out.println("Enter the 1st num");
int a = cs.nextInt();

System.out.println("Enter the 2nd num");
int b = cs.nextInt();

System.out.println("Enter the 3rd num");
int d = cs.nextInt();

int res1,res2,res3;

if(a+b==d){

System.out.println("The given condition is satisfied "+a+" + "+d+" = "+b+" ");
	}
else if(b+d==a) {

	System.out.println("The given condition is satisfied "+b+" + "+d+" = "+a+" ");

	}
else if(a+d==b){

		System.out.println("The given condition is satisfied");

	}
else {

	System.out.println("The given condition does not satisfied "+a+" + "+d+" = "+b+" ");

	}

}


}

public class int_2_to_3rd_integer{

public static void main(String [] arg){

int_2_to_3rd_int_bclass ob = new int_2_to_3rd_int_bclass();

ob.int_to_get_3rd();

}





}