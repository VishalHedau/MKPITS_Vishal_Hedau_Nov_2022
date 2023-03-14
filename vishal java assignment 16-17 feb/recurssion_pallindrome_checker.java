// A recurssive Java Paliindrome checker.....

public class recurssion_pallindrome_checker {
    public static void main(String[] args) {
        boolean flag = pallindrome_check("vishal");
        System.out.println(flag);
        flag = pallindrome_check("mallayallam");
        System.out.println(flag);
    }

    public static boolean pallindrome_check(String st) {
        if (st.length() == 0 || st.length() == 1) {
            return true;
        }
        if (st.charAt(0) == st.charAt(st.length() - 1)) {
            return pallindrome_check(st.substring(1, st.length() - 1));
        }
        return false;
    }
}
