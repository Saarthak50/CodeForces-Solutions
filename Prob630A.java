
import java.util.Scanner;

public class Prob630A {
    public static int ans(double n){
        return  25;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();
        if(n>=2){
            System.out.println(ans(n));
        }
        sc.close();
    }
}
