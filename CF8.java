public class CF8 {
    public static void main(String[] args) {
        int number = 10;

        for (int i = 2; i <= number; i++) {
            boolean isprime = true;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    isprime = false;
                    break;
                }
            }
            if (isprime)
                System.out.println(i);
        }

    }
}
