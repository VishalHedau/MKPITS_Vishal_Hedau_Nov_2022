class recurssion {
    int count = 0;

    int func() {
//        count = 0;
        if (count == 50)
            return count;
        System.out.println(count);
        count++;
        func();
        return 0;
    }


}

public class recurssion_001 {
    public static void main(String[] args) {
        recurssion ob = new recurssion();
        ob.func();
    }
}
