//Write a program to INSERT the ELEMENTS in an Array.

/* import java.util.*;

public class insert_elements_into_array
{
public static void main(String [] args)
{
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the length of an array : ");
	int length = sc.nextInt();

	int arr[] = new int[length];
	System.out.println("Enter the "+length+" elements");
		for(int i=0; i<arr.length; i++)
		{
			arr[i] = sc.nextInt();
			}
		for(int i=0; i<arr.length; i++)
		{
			System.out.println("arr["+i+"]"+arr[i]);
			}


}
}*/

import	java.util.*;

public class insert_elements_into_array
{
public static void main (String	[]	args)
{
	 Scanner sc = new Scanner (System.in);
	 System.out.println	("enter	the	size");
	 int length=	sc.nextInt	();
	 int arr[] = new int [length];
	 System.out.println	("enter	the	"+length+" elements");
	 	for(int	i=0; i<arr.length; i++)
	 {
	 	 arr[i]	= sc.nextInt();
	 }
	System.out.println(�Before Reverse of an array�);
for	(int	i	=	0;	i	<	arr.length;	i++)
	 {

	 	 System.out.println	("arr	["+i+"]	---->"+arr[i]);
	 }
for	(int	i	=	0;	i	<	arr.length/2;	i++)
{
int	t=arr[i];
arr[i]	=arr	[arr.length-1-i];
arr	[arr.length-1-i)	=t;
}
System.out.println	(�After	Reverse	of	an	array�);
for	(int	i	=	0;	i	<	arr.length;	i++)
	 {

	 	 System.out.println	("arr ["+i+"]	---->"+arr[i]);
	 }
}
}