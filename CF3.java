// Counts a digit number
public class CF3 {
    public static void main(String[] args) {

        int count = 0;
        int r;
        int number = 1230;
        while (number > 0) {
            // r = number % 10;
            number = number / 10;
            count++;
        }
        System.out.println(count);
    }
}
