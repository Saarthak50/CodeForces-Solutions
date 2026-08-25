import java.util.Scanner;

public class ANextRound{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] scores = new int[n+1];
        for(int i=0;i<n;i++){
            scores[i] = sc.nextInt();
        }
        int c=0;
        for(int score:scores){
            if(score >= scores[k-1] && score >0){
                c++;
            }
        }
        System.out.println(c);
    }
}