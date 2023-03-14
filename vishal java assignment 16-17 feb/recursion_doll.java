class russian_doll{

static void openRussianDoll(int doll) {
if (doll == 1) {
System.out.println("All dolls are opened");
} else {
openRussianDoll(doll-1);
}
}


}


public class recursion_doll
{
public static void main (String [] args)
{

russian_doll ob = new russian_doll();
ob.openRussianDoll(6);

}

}