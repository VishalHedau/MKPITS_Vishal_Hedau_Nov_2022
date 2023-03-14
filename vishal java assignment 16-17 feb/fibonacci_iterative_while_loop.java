// fibonacci series using iterative while loop....

public class fibonacci_iterative_while_loop {
    public static void main(String[] args) {
        int i=0,n1=0,n2=1,n3,num=5;
        while(i<=num){
            System.out.print(n1+n2+" ");
            n3=n1+n2;
            System.out.print(" "+n3);
            n1=n2;
            n2=n3;
            i++;
        }
    }
}
