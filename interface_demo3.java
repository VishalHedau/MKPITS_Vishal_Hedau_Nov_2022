interface one{

void one();

}

interface two{

void one();

}

class three implements one , two
{
public void one(){

System.out.println("class three implements one,two");

}

}

public class interface_demo3
{
public static void main(String[] args)
{
	three ob = new three();
	ob.one();

}
}