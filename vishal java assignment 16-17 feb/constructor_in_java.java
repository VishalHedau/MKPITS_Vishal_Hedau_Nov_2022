//Program to demonstrate the use of constructors in Java.


class constructor_in_java{  

int id;  
String name;  
void display(){
System.out.println(id+" "+name);

}  
  
public static void main(String args[]){  
constructor_in_java s1=new constructor_in_java(); 

constructor_in_java s2=new constructor_in_java();  
s1.display();  
s2.display();  
}  
}  