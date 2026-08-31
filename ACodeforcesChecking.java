import java.util.Scanner;

public class ACodeforcesChecking{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n-- >0){
            String target ="codeforces";
            String c = sc.next();
            if(target.contains(c)){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
        sc.close();
    }
}