//print a series of a number with recursive java methods....

public class recurssion_series_of_no {
    public static void main(String[] args) {
        callMyself(7);
    }
    public static void callMyself(int i){
        if(i<0){
            return;
        }
        System.out.println(i);
        i --;
        callMyself(i);

    }
}
