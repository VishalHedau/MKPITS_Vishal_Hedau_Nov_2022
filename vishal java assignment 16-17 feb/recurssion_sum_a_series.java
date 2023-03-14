// sum a series of numbers with java recurssion....

public class recurssion_sum_a_series {
    public static void main(String[] args) {
        int sum = func(10);
        System.out.println(sum);
    }
    public static int func(int num){
        if(num != 0){
            return num + func(num - 1);
        }else{
            return num;
        }


    }
}
