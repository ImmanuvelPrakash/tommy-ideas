// Reverse a number
public class CF4 {
    public static void main(String[] args) {
        int number = 123;
        while (number > 0) {
            int r = number % 10;
            number = number / 10;
            System.out.print(r);
        }
    }
}
