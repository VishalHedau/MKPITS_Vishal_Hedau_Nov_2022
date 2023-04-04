//write a java program to find maximum element of an array.

public class array_max_element {
    public static void main(String[] args) {
        int[] arr = {34, 56, 322, 12, 1, 10};
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                max = arr[i];
            }
//            System.out.println(max);

        }
        System.out.println("The maximum element of an array is : "+max);
    }
}
