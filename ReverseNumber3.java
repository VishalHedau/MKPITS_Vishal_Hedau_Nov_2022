import java.util.Scanner;

public class ReverseNumber3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();

        // type 3- StringBuilder
        StringBuilder sb = new StringBuilder();
        sb.append(num);
        sb.reverse();

        System.out.println("The reverse of a number : "+sb);
    }
}
