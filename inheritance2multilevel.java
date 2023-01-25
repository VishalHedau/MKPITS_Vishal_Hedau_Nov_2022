class one1
{
int a;
	void set1()
	{
	a=5;
	}
	void dis1()
	{
	System.out.println("a="+a);
	}
}

class two2 extends one1
{
int b;
	void set2()
	{
	b=10;
	}
	void dis2()
	{
	System.out.println("b="+b);
	}
}

class three3 extends two2
{
int c;
	void set3()
	{
	c=15;
	}
	void dis3()
	{
	System.out.println("c="+c);
	}
}

public class inheritance2multilevel
{
public static void main(String[] args)
{
	three3 ob = new three3();
	ob.set1();
	ob.set2();
	ob.set3();
	ob.dis1();
	ob.dis2();
	ob.dis3();
}
}