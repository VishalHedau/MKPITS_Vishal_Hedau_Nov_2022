// write a java program to find out whether a given integer is present in array or not.

public class array_find_element {
    public static void main(String[] args) {
        int [] arr = {3, 5, 7, 8, 13};
        int num = 15;
        boolean isInArray = false;
        for (int i=0;i<arr.length;i++){
            if (num == arr[i]){
                isInArray = true;
                break;
            }
        }
        if(isInArray){
            System.out.println("The value is present in an array");
        }else{
            System.out.println("The value is not present in an array");
        }

    }
}
