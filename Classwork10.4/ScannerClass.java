import java.util.Scanner;

public class ScannerClass {
    public static void main (String args []){
        Scanner scanner = new Scanner(System.in);
        int Grade;
        System.out.println("Please enter your grade here:");
        Grade = scanner.nextInt();
        scanner.close();
        if(Grade > 80){
            System.out.println("More than 80%");
        }else if(Grade == 80){
            System.out.println("Equals to 80%");
        }else if(Grade < 80 & Grade >= 60){
            System.out.println("More than 60%");
        }else if(Grade < 60 & Grade >= 40){
            System.out.println("Average");
        }else{
            System.out.println("Failed");
        }
    }
}
