
class inherit1
{
int a;
}

class inherit2 extends inherit1
{
	void set()
	{
	  a=12;
	}

	void dis()
	{
	System.out.println(a);
	}
}

public class inheritance1
{
public static void main(String[] args)
{
	inherit2 ob = new inherit2();
	//ob.a=12;
	ob.set();
	ob.dis();

}
}