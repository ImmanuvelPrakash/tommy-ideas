// Find the maximum and minimum of array
public class CF13 {
    public static void main(String[] args) {
        int A[] = { 3, 1, 6, 3, 0, 76, 32 };
        int temp;
        for (int i = 0; i < A.length; i++) {
            for (int j = i + 1; j < A.length; j++) {
                if (A[i] > A[j]) {
                    temp = A[i];
                    A[i] = A[j];
                    A[j] = temp;
                }

            }

        }
        System.out.println(A[0]);
        System.out.println(A[A.length - 1]);
    }
}

// quest cf14 is find the third largest element
// System.out.println(A[A.length - 3]);
