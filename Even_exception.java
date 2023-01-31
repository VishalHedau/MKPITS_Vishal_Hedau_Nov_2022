import java.util.*;


class oddException extends Exception
{
	oddException(String s)
	{
	super(s);
	}

}
class evenException extends Exception
{
	evenException(String s1)
	{
	super(s1);
	}

}

public class Even_exception
{
public static void main(String [] args) throws Exception
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter integer");
int n = sc.nextInt();
//int n = 2;
if (n%2==0)
{
	evenException ob1 = new evenException("even exception");
	throw ob1;
	//System.out.println("Yes integer is Even");
}else{
	oddException ob = new oddException("odd exception");
	throw ob;

}



}
}