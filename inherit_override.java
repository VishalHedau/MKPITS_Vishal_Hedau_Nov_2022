class inherit1
{
	void dis()
	{
	System.out.println("inherit 1");
	}
}

class inherit2 extends inherit1
{
	void dis()
	{
	System.out.println("inherit 2");
	}

}

public class inherit_override
{
public static void main(String[] args)
{
	inherit2 ob = new inherit2();
	ob.dis();
}
}