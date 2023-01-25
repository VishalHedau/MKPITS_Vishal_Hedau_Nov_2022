interface one{

void one();

}

class two implements one
{
public void one(){

System.out.println("one interface to class");

}

}

public class interface_demo1
{
public static void main(String[] args)
{
	two ob = new two();
	ob.one();

}
}