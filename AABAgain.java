import java.util.Scanner;

public class AABAgain{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        while(n-- >0){
            int num =sc.nextInt();
            int sumOfdigits =0;
            while(num>0){
                int dig = num%10;
                sumOfdigits+=dig;
                num/=10;

            }
            System.out.println(sumOfdigits);

        }
    }
}