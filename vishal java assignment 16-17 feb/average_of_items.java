//write a java program that accepts two items weight (floating points value) & no. of purchase (floating points value) & calculate the average value of items

import java.util.Scanner;

public class average_of_items {
    public static void main(String[] args) {
        float w1,w2;
        float no_of_purchase;
        float avg;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter weight of item 1");
        w1 = sc.nextFloat();
        System.out.println("Enter weight of item 2");
        w2 = sc.nextFloat();
        System.out.println("Enter number of purchase");
        no_of_purchase = sc.nextFloat();

        avg = (w1+w2)/no_of_purchase;
        System.out.println("Average weight of items : "+avg);
    }
}
