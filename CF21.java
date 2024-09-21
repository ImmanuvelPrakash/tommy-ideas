public class CF21 {
    public static void main(String[] args) {
        int A[] = { 17, 1, 9, 3, 6 };
        int B[] = { 1, 3, 6 };
        int count = 0;
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B.length; j++) {
                if (A[i] == B[j]) {
                    count++;
                }
            }

        }
        if (count == B.length) {
            System.out.println("is a subset");
        } else {
            System.out.println("not is a subset");

        }

    }
}
