import  java.util.*;
public class APanoramixSPrediction {

    static boolean isPrime(int n){
        if(n<2) return false;
        for(int i=2;i*i<=n;i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b=  sc.nextInt();

        int next = a+1;
        while(!isPrime(next)){
            next++;
        }
        if(next == b){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }

       

    }
    
}
