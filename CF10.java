// pallindrom

public class CF10 {
    public static void main(String[] args) {

        int n = 121;
        int r;
        int s = 0;
        int number = n;
        while (n > 0) {
            r = n % 10;
            s = (s * 10) + r;
            n = n / 10;
        }
        if (s == number) {
            System.out.println("pallindrom");
        } else {
            System.err.println("NOT a pallindrom");
        }
    }
}
