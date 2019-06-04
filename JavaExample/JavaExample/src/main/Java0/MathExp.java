package src.main.Java0;

/**
 * Created by byang on 2018-10-26.
 */
public class MathExp {
   // private static final double radius = 7.5;

    public static void main(String[] args) {
        double radius = 7.5;
        double perimeter = 2 * Math.PI * radius;
        double area = Math.PI * radius * radius;

        System.out.println("Perimeter is = " + perimeter);
        System.out.println("Area is = " + area);

        double width = 5.6;
        double height = 8.5;

        double perimeter1 = 2*(height + width);

        double area1 = width * height;

        System.out.printf("Perimeter is 2*(%.1f + %.1f) = %.2f \n", height, width, perimeter1);

        System.out.printf("Area is %.1f * %.1f = %.2f \n", height, width, area1);
    }
}
