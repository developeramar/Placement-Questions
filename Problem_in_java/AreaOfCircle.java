
import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        
        double radius;
        System.out.println("Enter Radius --");
        Scanner sc =new Scanner(System.in);

        radius = sc.nextDouble();

        double radiusofcircle = 3.14*radius;

        System.out.println("Radius of circle is -- "+ radiusofcircle);
        

    }
}
