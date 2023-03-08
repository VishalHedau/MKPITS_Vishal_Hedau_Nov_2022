
import java.util.Scanner;

public class taking_paramerters_ {

    public static void addition(int num1,int num2){

        int sum = num1+num2;

        System.out.println(sum);
    }
    public static void multiplication(int a , int  b){


        int mul = a*b;

        System.out.println(mul);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter num to add");

        System.out.println("enter the first num");
        int num1 = sc.nextInt();

        System.out.println("enteer the second num");
        int num2 = sc.nextInt();
        addition(num1 , num2);

        System.out.println("Enter num to multiply ");

        System.out.println("Enter the first num");
        int a = sc.nextInt();

        System.out.println("Enter the second num");
        int b = sc.nextInt();
        multiplication(a,b);
    }
}
