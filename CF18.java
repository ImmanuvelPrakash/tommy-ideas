// Sort and Ascending
public class CF18 {
    public static void main(String[] args) {
        int A[] = { 1, 0, 2, 0, 1, 2, 1, 0 };
        int temp;
        for (int i = 0; i < A.length; i++) {
            for (int j = i + 1; j < A.length; j++) {
                if (A[i] > A[j]) {
                    temp = A[i];
                    A[i] = A[j];
                    A[j] = temp;
                }

            }
            System.out.println(A[i]);

        }

    }
}
