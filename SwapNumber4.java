public class SwapNumber4 {
    public static void main(String[] args) {

        int num1 = 20;
        int num2 = 40;

        System.out.println("Numbers before swap: num1 = "+num1+" , num2 = "+num2);

        // fifth type - Single Line

        num2 = num1+num2 - (num1=num2);

        System.out.println("Numbers after swap: num1 = "+num1+" , num2 = "+num2);

    }
}
