import java.util.Scanner;

public class ANearlyLuckyNumber{
    public static boolean  isluckyNo(int n){
        if(n == 0 ) return false;
        while(n > 0){
            int d = n%10;
            if(d !=4 && d != 7){
                return false;
            }
            n/=10;
        }
        return true;
        }
        
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        int count = 0;
        for(char ch: n.toCharArray()){
            if(ch =='4' || ch == '7'){
                count++;

            }
        }
        System.out.println(isluckyNo(count) ? "YES" : "NO");
        sc.close();
    }
}