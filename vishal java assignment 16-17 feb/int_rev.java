//Write a program to reverse an integer in Java.

public class int_rev{
public static void main(String [] args){

int num = 234567;
int i=0;
int rev;
while(num != 0){
	rev=num%10;
	num=num/10;
	i++;
	System.out.print(rev);
	}
}
}
