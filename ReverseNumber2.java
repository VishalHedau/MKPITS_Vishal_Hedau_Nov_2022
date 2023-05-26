import java.util.Scanner;

public class ReverseNumber2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();

        // type 2 by using StringBuffer



        StringBuffer sb = new StringBuffer(String.valueOf(num));
        StringBuffer rev = sb.reverse();

        System.out.println("Reverse of a number : "+rev);
    }
}
