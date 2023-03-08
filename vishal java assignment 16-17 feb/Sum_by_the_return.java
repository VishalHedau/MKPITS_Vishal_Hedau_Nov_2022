// java basics with return the sum method......


import java.util.Scanner;

public class Sum_by_the_return {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first num");
        int a = sc.nextInt();

        System.out.println("Enter the second num");
        int b = sc.nextInt();

        System.out.println(my_method(a,b));

    }

    public static int my_method(int x , int  y){

        int sum = x + y ;

        return sum;
    }
}
