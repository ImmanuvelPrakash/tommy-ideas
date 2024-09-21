// FIND THE REPEATING NUM
public class CF17 {
    public static void main(String[] args) {
        int A[] = { 8, 6, 8, 1, 2, 3, 3, 0, 0 };
        for (int i = 0; i < A.length; i++) {
            for (int j = i + 1; j < A.length; j++) {
                if (A[i] == A[j]) {
                    System.err.println(A[i]);
                }
            }
        }
    }
}
