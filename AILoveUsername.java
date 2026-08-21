
import java.util.Scanner;

public class AILoveUsername{
    static int noOfAmazingPerformances(int n,int[] arr){
        int max = arr[0];
        int min= arr[0];
        int count = 0;
        for (int i = 1; i < arr.length; i++){
            if(arr[i] > max){
                count++;
                max = arr[i];
            }else if(arr[i]<min){
                count++;
                min = arr[i];
            }
            
        }
        return count;


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0 ; i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(noOfAmazingPerformances(n, arr));
       

       
    }
}