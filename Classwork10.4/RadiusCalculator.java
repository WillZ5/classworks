import java.util.Scanner;

public class RadiusCalculator {
    public static void main (String args []){
        double Radius;

        System.out.println("Please enter your radius here:");
        Scanner scanner = new Scanner(System.in);
        Radius = scanner.nextDouble();
        scanner.close();
        if(Radius > 0){
            double Area = 3.14 * Radius * Radius;
            System.out.println("The area is "+ Area);
            }else{
            System.out.println("Negative input");
        }
    }
}
