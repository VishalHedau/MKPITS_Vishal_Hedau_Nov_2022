import java.util.Scanner;

public class days_in_yrswkdys {
    public static void main(String[] args) {
        int days;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of days");
        days = sc.nextInt();

        int yrs,weeks,day;

        yrs = days/365;
        days = days%365;
        System.out.println("years="+yrs);
        weeks = days/7;
        days = days%7;
        System.out.println("weeks="+weeks);
       // day = days/30;
        day = days%30;
        System.out.println("days="+day);
//        yrs = days/365;
//        System.out.println("years="+yrs);
//        weeks = (days % 365)/7;
//        System.out.println("weeks="+weeks);
//        day = days- ((yrs*365) + (weeks*7));
//        System.out.println("days="+day);
    }
}
