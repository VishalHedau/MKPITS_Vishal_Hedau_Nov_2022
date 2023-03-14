import java.util.*;

public class search_in_array {
    public static void main(String[] args) {
        int len,i=0,inp,flag=0;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array");
        len = sc.nextInt();

        int a[] = new int[len];
        System.out.println("Enter the elements"+len);
            for(i=0;i<len;i++) {
                a[i] = sc.nextInt();
            }
               System.out.println("Enter an element for searching");
               inp = sc.nextInt();
               for(i=0;i<len;i++){
                   if(a[i]==inp){
                       flag=1;
                       break;
                   }else{
                       flag=0;
                   }
                   if(flag == 1){
                       System.out.println("Element found at position "+(i+1));
                   }else{
                       System.out.println("Element not found");
                   }


               }

            }

    }

