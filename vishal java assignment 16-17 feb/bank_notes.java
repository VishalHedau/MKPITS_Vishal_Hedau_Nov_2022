import java.util.Scanner;

public class bank_notes {
    public static void main(String[] args) {
        int amt;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Amount");
        amt = sc.nextInt();

        amt = amt/10;
        System.out.println("The smallest possible numbers of bank notes is "+amt);
    }
}
