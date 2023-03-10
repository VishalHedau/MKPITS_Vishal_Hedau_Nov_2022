
import java.util.*;

public class ass17_7_dig_sep{

public static void main(String [] argu){

Scanner sc = new Scanner(System.in);

System.out.println("Enter The first num");
int a = sc.nextInt();

int temp,b,c,d,e,f,g;

temp = a;
//      1 2 3 4 5 6 7
//      a b c d e f g

g = a%10;
a = a/10;

f = a%10;
a = a/10;

e = a%10;
a = a/10;


d = a%10;
a = a/10;


c = a%10;
a = a/10;

b = a%10;
a = a/10;

System.out.println(+a+"  "+b+"  "+c+"  "+d+"  "+e+"  "+f+"  "+g+"  ");
}

}