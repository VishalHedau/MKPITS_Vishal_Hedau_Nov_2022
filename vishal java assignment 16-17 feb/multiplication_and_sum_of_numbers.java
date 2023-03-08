// multiplication  and sum of the numbers in java.......

import java.util.Scanner;

public class multiplication_and_sum_of_numbers {

    public static int multiply(int a,int b){
        int mul = a*b;
        return mul;

    }

    public static int addition(int a , int b){
        int sum1 = a + b ;
        return sum1 ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first num");
        int a = sc.nextInt();

        System.out.println("Enter the second num");
        int b = sc.nextInt();

       int mul = multiply(a,b);
        System.out.println(mul);


      int sum1 =  addition(a,b);
        System.out.println(sum1);

    }
}
