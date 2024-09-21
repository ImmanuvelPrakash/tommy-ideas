//Select an element if it is yes or no

public class CF15 {
    public static void main(String[] args) {
        int A[] = { 3, 1, 6, 3, 0, 76, 32 };
        int Search = 4;
        for (int i = 0; i < A.length; i++) {

            if (A[i] == Search) {
                System.out.println("yes");
                break;
            } else {
                System.out.println("no");
                break;
            }

        }

    }

}
