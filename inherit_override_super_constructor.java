class inherit1
{
	inherit1()
		{

	}

	inherit1(int x, int y)
	{
	System.out.println("x="+x+"y="+y);
	}
}

class inherit2 extends inherit1
{
	inherit2()
	{
	inherit1 tob = new inherit1(2,3);
	}

}

public class inherit_override_super_constructor
{
public static void main(String[] args)
{
	inherit2 ob = new inherit2();

}
}