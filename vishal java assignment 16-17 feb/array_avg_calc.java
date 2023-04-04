/*
write a java program to calculate average marks froman array containing marks of all students in physics using for each loop.
 */

public class array_avg_calc {
    public static void main(String[] args) {
        int [] arr = {85, 92, 76, 90, 80};
        int sum = 0;
        for(int element : arr){
            sum = sum + element;
        }
        System.out.println("The average of the marks is :"+sum/arr.length);
    }
}
