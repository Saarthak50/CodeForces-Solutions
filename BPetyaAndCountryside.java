import java.util.*;
public class BPetyaAndCountryside{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr =new int[n];
        int i=0;
        while(n>i){
            arr[i] = sc.nextInt();
            i++;

        }
         int max = 1;

        i = 0;
        while (i < n) {

            int count = 1;

            // Move left
            int j = i;
            while (j > 0 && arr[j - 1] <= arr[j]) {
                count++;
                j--;
            }

            // Move right
            j = i;
            while (j < n - 1 && arr[j + 1] <= arr[j]) {
                count++;
                j++;
            }

            max = Math.max(max, count);
            i++;
        }

        System.out.println(max);
        sc.close();
    }
}