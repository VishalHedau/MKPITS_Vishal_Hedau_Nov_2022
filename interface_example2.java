interface one
{
void fun();
}

interface two
{
void fun();
}

class three implements one ,two
{
public void fun(){
}
}


class four extends three
{
public void fun(){
System.out.println("done");
}
}

public class interface_example2{
public static void main(String[] args){

four ob = new four();
ob.fun();

}
}