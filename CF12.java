// Perfect number
public class CF12 {
    public static void main(String[] args) {
        int n = 10;
        int sum = 0;

        for (int i = 1; i < 28; i++) {
            if (n % i == 0) {
                sum = sum + i;

            }

        }
        if (sum == n) {
            System.out.println("perfect number");
        } else {
            System.out.println("not ");
        }
    }
}
