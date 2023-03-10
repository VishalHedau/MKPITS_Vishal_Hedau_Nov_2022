
import java.util.*;

class ass9_y_x_n{

public static void main(String [] args){

	// y = xn

	int res;
	Scanner sc = new Scanner(System.in);

System.out.println("Enter value of y ");
int y = sc.nextInt();

System.out.println("Enter value of x ");
int x = sc.nextInt();

System.out.println("Enter value of n ");
int n = sc.nextInt();

res = x*n;

if(y == res){

	System.out.println(+res+" Satisfy the condition of y=xn");

	}
	else{

	System.out.println(" Does not Satisfy the condition of y=xn");

		}
}



}