import java.util.Scanner;

public class AHulk{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        StringBuilder s = new StringBuilder("");
        for(int i = 1; i<=n ;i++){
            if(i%2 != 0){
                s.append("I hate");
            }else{
                s.append("I love");

            }
            if(i!=n){
                s.append(" that ");
            }else{
                s.append(" it ");
            }
        }
        System.out.println(s.toString());
    }
}