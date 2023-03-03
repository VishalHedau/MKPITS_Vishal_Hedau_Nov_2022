//Write a java program to print your name, date of birth, and mobile number.

import java.util.*;
import java.time.LocalDate;


public class print_name_dob_mob_no{
public static void main(String [] args) throws Exception
{
	Scanner sc = new Scanner(System.in);

	System.out.print("Enter your name : ");
	String name = sc.nextLine();

	System.out.print("Enter your DOB in YYYY-MM-DD format: ");
	String Date_of_birth = sc.nextLine();

	System.out.print("Enter your Mobile Number : ");
	long mb_no = sc.nextLong();

	System.out.println("Name of user is " + name);

	LocalDate dob = LocalDate.parse(Date_of_birth);
	System.out.println("DOB of user is " + dob);

	System.out.println("Mobile Number of user is " +mb_no );

	//sc.close();
}
}