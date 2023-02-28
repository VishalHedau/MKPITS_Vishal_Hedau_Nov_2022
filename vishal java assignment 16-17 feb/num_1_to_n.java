//1) Write a program to Print 1 to N numbers.

import java.util.*;

public class num_1_to_n {
    public static void main(String[] args) {

        // input from keyboard
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();

        // logic to print 1 to n numbers
        for (int i=1;i<=n;i++){
            System.out.println(i);
        }
    }
}
