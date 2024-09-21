// /find a power of number

public class CF5 {
    public static void main(String[] args) {
        int G = 3;
        int n = 5;
        int r = 0, num = 1;
        // int NUM = 0;
        for (int i = 1; i <= n; i++) {
            r = num * G;
            num = r;

        }
        System.out.println(num);

    }
}
