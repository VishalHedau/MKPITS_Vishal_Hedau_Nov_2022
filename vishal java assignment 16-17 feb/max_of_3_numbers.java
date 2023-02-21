//write a java program that accept 3 integer & calculate maximum of 3 integer

import java.util.Scanner;

public class max_of_3_numbers {
    public static void main(String[] args) {
        int n1,n2,n3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st integer");
        n1 = sc.nextInt();
        System.out.println("Enter 2nd integer");
        n2 = sc.nextInt();
        System.out.println("Enter 3rd integer");
        n3 = sc.nextInt();

        if(n1>n2) {
            if (n1 > n3) {
                System.out.println("maximum of 3 integer is " + n1);
            } else {
                System.out.println("maximum of 3 integer is " + n3);
            }
        } else if(n2>n3)
            {
                System.out.println("maximum of 3 integer is "+n2);
            }else{
            System.out.println("maximum of 3 integer is "+n3);
        }

    }
}
