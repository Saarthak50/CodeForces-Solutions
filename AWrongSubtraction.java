import java.util.Scanner;

public class AWrongSubtraction {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int k = sc.nextInt();
        int num = n;
        while(k-- > 0){
            if( num % 10 != 0){
                num = num - 1;
            }else if(num % 10 == 0){
                num = num/10;
            }
        }
        System.out.println(num);
        sc.close();
    }
}
