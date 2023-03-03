/*Write a C program to check whether an alphabet is a vowel or consonant.*/

import java.util.Scanner;

class check_the_vowels_and_consonents
{
public static void main(String[]args)
{

   Scanner val= new Scanner(System.in);
   System.out.println("Enter the alphabet : ");
   char ch = val.next().charAt(0);
   if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' ||
       ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
   {
      System.out.println("it is a Vowel");
   }
   else
   {
       System.out.println("it is a Consonant");
   }
}
}