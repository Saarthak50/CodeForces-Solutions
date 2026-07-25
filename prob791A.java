
import java.util.Scanner;

public class prob791A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); //limaks
        int b = sc.nextInt(); //uska bhai
        int years = 0;
        while(a <= b){
            a*=3;
            b*=2;
            years++;
        }
        System.out.println(years);
        sc.close();
       
    }
}
