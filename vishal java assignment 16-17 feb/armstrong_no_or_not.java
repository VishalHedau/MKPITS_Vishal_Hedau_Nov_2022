public class armstrong_no_or_not {
    public static void main(String[] args) {
        int num=258,number,temp,total=0;
        number=num;

        while(number != 0){
            temp = number % 10;
            total = total + temp*temp*temp;
            number = number/10;
        }
        if(total == num){
            System.out.println("Armstrong");
        }else{
            System.out.println("not-armstrong");
        }
    }
}
