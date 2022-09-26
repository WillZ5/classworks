import java.util.Scanner;

public class HuiWen {
    public static void main(String[] args) {
        String str = "";
        System.out.println("Enter your words.");
        Scanner input = new Scanner(System.in);
        str = input.next();

        StringBuffer rv = new StringBuffer(str);
        rv.reverse();

        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == rv.charAt(i)) {
                count++;
            }
        }
        if (count == str.length()) {
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

    }
}
