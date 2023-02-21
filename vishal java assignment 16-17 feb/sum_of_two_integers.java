//write a program that accepts two integers from the user and calculate the sum of two integers.....

import java.util.Scanner;

public class sum_of_two_integers {
    public static void main(String[] args) {
        int n1,n2;
        int sum;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first integer");
        n1 = sc.nextInt();
        System.out.println("Enter second integer");
        n2 = sc.nextInt();

        sum = n1 + n2;
        System.out.println("Sum of two integers is :"+sum);
    }
}
