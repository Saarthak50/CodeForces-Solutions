import java.util.Arrays;
import java.util.Scanner;

public class ATwins{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int total = 0;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            total += a[i];
        }
        Arrays.sort(a);
        int sum = 0;
        int count = 0;

        for (int i = n - 1; i >= 0; i--) {
            sum += a[i];
            count++;
            if (sum > total / 2) break;
        }

        System.out.println(count);
        sc.close();
    }
}