import java.util.Scanner;

public class Elephant617A {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Solution s = new Solution();
        int x = sc.nextInt();
        System.out.println(s.minDist(x));
        sc.close();
    }
    static class Solution{
        public  int minDist(int x){
            int maxStep = x / 5;
            int remSteps = x % 5;
            if(remSteps==0){
                return maxStep;
            }else{
                return maxStep+1;
            }
        }
}
}
