import java.util.Arrays;

public class CF20 {
    public static void main(String[] args) {
        int A[] = { 1, 2, 3, 4, 5 };
        int B[] = new int[A.length];
        int k = 1;
        for (int i = 0; i < A.length; i++) {

            if (i + k >= A.length) {
                B[(i + k) % A.length] = A[i];
            } else {
                B[i + k] = A[i];
            }

        }
        System.out.println(Arrays.toString(B));

    }

}
