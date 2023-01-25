class inherit1
{


	inherit1(int x, int y)
	{
	System.out.println("x="+x+"y="+y);
	}
}

class inherit2 extends inherit1
{
	inherit2()
	{
	super(5,6);
	}

}

public class inherit_override_super_constructor_use
{
public static void main(String[] args)
{
	inherit2 ob = new inherit2();

}
}