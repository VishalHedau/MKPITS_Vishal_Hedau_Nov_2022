// java program to create an array of 5 floats and calculate their sum.

public class array_cal_float_sum {
    public static void main(String[] args) {
        float [] arr = {45.7f, 57.4f, 21.6f, 89.0f, 1.0f};
        float sum = 0;

//        for(float i=0; i<arr.length;i++){
//            sum = sum+arr[(int) i];
//        }
        for (float elements:arr) {
            sum = sum + elements;

        }
//        System.out.println(sum);
        System.out.println("The sum of the float array is : "+sum);
    }
}
