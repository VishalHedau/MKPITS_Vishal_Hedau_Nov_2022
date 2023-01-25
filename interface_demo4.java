interface one{

void one();

}

interface two extends one{

void one();

}

class three implements two
{
public void one(){

System.out.println("interface two extends one");
System.out.println("class three implements two");

}

}

public class interface_demo4
{
public static void main(String[] args)
{
	three ob = new three();
	ob.one();

}
}