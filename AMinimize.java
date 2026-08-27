    import java.util.Scanner;

    public class AMinimize{
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-- > 0){
                int a=sc.nextInt();
                int b=sc.nextInt();
                int mini=Integer.MAX_VALUE;
                for(int c=a;c<=b;c++){
                    int val = (c-a)+(b-c);
                    if(val<mini){
                        mini=val;
                    }
                }
                System.out.println(mini);
            }
        }
    }