// How to find the sum of digits of a positive integer number using recursion ?

public class recursion_sum_of_digit {
    static int sum_of_digit(int n) {
        if (n == 0)
            return 0;
        return (n % 10 + sum_of_digit(n / 10));
    }

    public static void main(String[] args) {
        int num=123456;
        int result=sum_of_digit(num);
        System.out.println("The sum of num "+num+" is "+result);
    }
}
