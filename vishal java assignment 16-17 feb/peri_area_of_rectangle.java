public class peri_area_of_rectangle {
    public static void main(String[] args) {
        int hei = 7;
        int wid = 5;
        int peri;
        int area;

        area = hei * wid;
        System.out.println("Area of rectangle is "+area);

        peri = 2 * ( hei + wid );
        System.out.println("Perimeter of rectangle is "+peri);
    }
}
