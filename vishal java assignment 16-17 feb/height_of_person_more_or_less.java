import java.util.Scanner;

class height_of_person_more_or_less
{
public static void main(String[]args)
{
  int ht;
  Scanner val = new Scanner(System.in);
  System.out.println("enter the height");
  ht=val.nextInt();
  
  if(ht<100)
  {
    System.out.println("ht is small");
  }
  else if(ht>100)
  {
    System.out.println("ht is taller");
  }
}
}