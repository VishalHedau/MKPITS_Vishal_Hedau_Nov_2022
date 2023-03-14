class recurssion_fibo {
    public int fibonacci(int n) {
        if (n < 0) {
            return -1;
        }
        if (n == 0 || n == 1) {
            return n;
        }

        return fibonacci(n-1) + fibonacci(n-2);
    }


}
public class fibonacci_recurssion{
    public static void main(String[] args) {
        recurssion_fibo ob = new recurssion_fibo();
        System.out.println(ob.fibonacci(4));

    }

}