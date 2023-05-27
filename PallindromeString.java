import java.util.Scanner;

public class PallindromeString {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your String : ");
        String str = sc.next();

        String org_str = str;

        String rev = "";

        int len = str.length();

        for (int i=len-1; i>=0; i--){
            rev = rev + str.charAt(i);
        }

        if(org_str.equals(rev)){
            System.out.println(rev+" is Pallindrome");
        }
        else{
            System.out.println(rev+" is Not Pallindrome");
        }
    }
}
