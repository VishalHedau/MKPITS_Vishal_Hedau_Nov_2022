public class ReverseString03 {
    public static void main(String[] args) {

        String str = "vishal";

        StringBuffer sb = new StringBuffer(str);
        sb.reverse();

        System.out.println(sb);
    }
}
