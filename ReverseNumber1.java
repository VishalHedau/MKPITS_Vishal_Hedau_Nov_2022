import java.util.Scanner;

public class ReverseNumber1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :");
        int num = sc.nextInt();

        // type 1
        int rev = 0;

        while(num != 0){
            rev = rev*10 + num%10;
            num = num / 10;
        }
        System.out.println("The reverse of a number is : "+rev);
    }
}
