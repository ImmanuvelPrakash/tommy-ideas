// GCD
public class CF6 {
    public static void main(String[] args) {
        int Big = 65;
        int Small = 20;
        int r = 1;
        while (r >= 1) {
            r = Big % Small;
            Big = Small;
            Small = r;
        }
        System.out.println("GCD of two number is" + Big);
    }
}
