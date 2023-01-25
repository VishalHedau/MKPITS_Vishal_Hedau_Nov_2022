interface one
{
void fun();
}

class two implements one
{
public void fun(){
}
}

class three extends two
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

public class interface_example{
public static void main(String[] args){

four ob = new four();
ob.fun();

}
}