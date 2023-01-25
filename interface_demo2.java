interface one{

void one();

}

class two implements one
{
public void one(){

System.out.println("one interface to class");

}

}

class three extends two implements one
{
public void one(){

System.out.println("class two implements one interface, class three extends class two");

}

}

public class interface_demo2
{
public static void main(String[] args)
{
	three ob = new three();
	ob.one();

}
}