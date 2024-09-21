//  find the misssing number

public class CF16 {
    public static void main(String[] args) {
        int A[] = { 1, 5, 3, 4 };
        int n = 5;
        int sum = 0, sum1 = 0;
        for (int i = 0; i < A.length; i++) {
            sum1 = sum1 + A[i];
        }
        sum = n * (n + 1) / 2;
        System.out.println(sum - sum1);
    }

}
