public class Swapnumber {
    public static void main(String[] args) {

        int num1 = 20;
        int num2 = 40;

        System.out.println("Numbers before swap: num1 = "+num1+" , num2 = "+num2);

        // first type (Third variable)

        int temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println("Numbers after swap: num1 = "+num1+" , num2 = "+num2);

    }
}
