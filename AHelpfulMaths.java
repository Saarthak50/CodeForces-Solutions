import java.util.Arrays;
import java.util.Scanner;

public class AHelpfulMaths{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String[] arr = s.split("\\+");
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            if(i>0){
                System.out.print("+");
            }
            System.out.print(arr[i]);
        }
        sc.close();
        
    }
}