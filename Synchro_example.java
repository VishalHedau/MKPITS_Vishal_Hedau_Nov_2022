//synchronization in java


class sync
{
	synchronized void dis (String sc)
	{
	System.out.print("[ "+sc);
	try{
	Thread.sleep(1000);
	}
	catch(Exception e){
	}
	//System.out.print("]");

	}
}

class sync2 implements Runnable
{
	Thread t;
	String s;
	sync so;

	sync2(sync soref,String sr)
	{
	t = new Thread(this);
	so = soref;
	s = sr;
	t.start();
	}

	public void run()
	{
	so.dis(s);
	}


}

public class Synchro_example
{
public static void main(String [] args)
{
	sync ob1 = new sync();
	sync2 ob2 = new sync2(ob1,"my ");
	sync2 ob3 = new sync2(ob1,"name is ");
	sync2 ob4 = new sync2(ob1,"vishal");


}
}