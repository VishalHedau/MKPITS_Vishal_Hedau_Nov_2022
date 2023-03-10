//reverse the array

import java.util.*;

public class Array_01{

public static void main(String [] args){
int n;
Scanner sc = new Scanner(System.in);

System.out.println("Enter the size : ");
int size = sc.nextInt();

int a[] = new int [size];

System.out.println("Enter the elements"+size);
for(int i=0;i<a.length;i++){

a[i] = sc.nextInt();
}
for(int i=0;i<a.length/2;i++)
{
int t=a[i];
a[i]=a[a.length-1-i];	// main logic
a[a.length-1-i] = t;
}


System.out.println("After Reverse of an elements");
for(int i=0;i<a.length;i++)
	 {

	 	 System.out.println("elements"+a[i]);
	 }



}



}