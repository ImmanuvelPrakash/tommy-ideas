// Sqaure root
public class CF11 {
    public static void main(String[] args) {

        int n = 25;
        int n1 = 0;
        for (int i = 1; i <= 25; i++) {
            if (n % i == 0) {
                if (i * i == n) {
                    System.out.println(i);
                }
            }
        }
        // Another way
        // for (int i = 1; i <= 25 / 2; i++) {

        // if (i * i == n) {
        // System.out.println(i);
        // }

        // }

    }

}
