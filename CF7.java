//  print the all divisor of the given number
public class CF7 {
    public static void main(String[] args) {
        int n = 20;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.println(i);
            }
        }
    }
}
