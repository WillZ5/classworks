import java.util.Scanner;

public class RadiusCul {
    public static void main(String[] args){
        final double Pi = 3.14;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your radius here:");
            double Radius = scanner.nextDouble();
        if(Radius > 0){
            System.out.println("The area is " + Pi*Radius*Radius);
        }else{
            System.out.println("Negative input");
        }
    }
}
