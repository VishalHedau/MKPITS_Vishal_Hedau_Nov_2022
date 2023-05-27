public class ReverseString01 {
    public static void main(String[] args) {

        // first type to reverse a string

        String str = "vishal";
        String rev = "";

        int len = str.length();

        for(int i=len-1; i>=0; i--){
            rev = rev + str.charAt(i);
        }
        System.out.println(rev);
    }
}
