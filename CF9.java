// ARMSTRONG NUMBER
public class CF9 {
    public static void main(String[] args) {
        int n = 371;
        int r;
        int s = 0;
        int number = n;
        while (n > 0) {
            r = n % 10;
            s = s + (r * r * r);
            n = n / 10;
        }
        if (s == number) {
            System.out.println("armstrong");
        } else {
            System.err.println("NOT a armstrong");
        }
    }
}
