public class CF19 {
    public static void main(String[] args) {
        int A[] = { 1, 2, 3, 4, 5 };
        int B[] = { 1, 2, 4, 5, 3 };
        int count = 0;
        if (A.length == B.length) {
            for (int i = 0; i < A.length; i++) {
                for (int j = 0; j < B.length; j++) {
                    if (A[i] == B[j]) {
                        count++;
                    }
                }
            }
            if (count == A.length) {
                System.out.println("equal");
            }
        } else {
            System.out.println("not equal");
        }

    }

}
