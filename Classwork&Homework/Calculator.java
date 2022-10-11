import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your first value.");
            int Num1 = scanner.nextInt();
        System.out.println("Please enter your second value.");
            int Num2 = scanner.nextInt();
        System.out.println("Please select an Arithmetic operators.");
        System.out.println("1:+  2:-  3:*  4:/");
        	  int Num3 = scanner.nextInt();
        scanner.close();
 


        switch (Num3) {
            case 1:
                System.out.println(Num1 + Num2);
                break;
            case 2:
                System.out.println(Num1 - Num2);
                break;
            case 3:
                System.out.println(Num1 * Num2);
                break;
            case 4:
                System.out.println(Num1 / Num2);
                break;
            default:
                System.out.println("Error"); // :( :( :( :(
        }
    }
}
