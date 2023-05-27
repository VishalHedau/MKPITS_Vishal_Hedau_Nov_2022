public class ReverseString02 {
    public static void main(String[] args) {

        // second type to reverse a string

        String str = "vishal";
        String rev = "";

        char a[] = str.toCharArray();
        int len = str.length();

        for(int i=len-1; i>=0; i--){
            rev = rev + a[i];
        }
        System.out.println(rev);
    }
}
