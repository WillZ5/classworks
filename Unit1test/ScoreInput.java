import java.util.Scanner;

public class ScoreInput{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your math score");
        int Math = scanner.nextInt();
        System.out.println("Please enter your english score");
        int English = scanner.nextInt();

        int i = Math + English;

        switch(i) {
            case 200:
                System.out.println("Good job!");
                break;
            case 0:
                System.out.println("How?");
                break;
            default:
                System.out.println("Keep working!");

        }
    }
}
