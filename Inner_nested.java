class inner{
	int  b1=12;

	void dis1(){
	System.out.println("one called");
	two tob=new two();
	tob.dis();
	}

	class two
	{
	int a;
	void dis(){
	System.out.println("two "+b1);
	}
	}

}
public class Inner_nested{
	public static void main(String[] args){

	inner ob1=new inner();
	ob1.dis1();

	}


}
