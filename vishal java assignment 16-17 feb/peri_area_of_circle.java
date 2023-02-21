//Write a java program to compute the parimeter and area of circle with radius of 6 inches


public class peri_area_of_circle {
    public static void main(String[] args) {
        float rad=6;
        float area;
        double peri;
        area = (float) (3.14 * rad * rad);
        System.out.println("Area of circle is "+area+" inches");

        peri = 2 * 3.14 * rad;
        System.out.println("circumference of circle is "+peri+" inches");
    }
}
