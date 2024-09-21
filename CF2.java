
import java.util.Scanner;

// Find last digit number
public class CF2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number");
        int num = sc.nextInt();

        int r = num % 10;
        System.out.println(r);
    }
}