import java.util.Scanner;

public class Problem546A {
     
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int costof1stbanana = sc.nextInt();
        int intialdollars = sc.nextInt();
        int totalbananastobuy = sc.nextInt();
        int totalCost = costof1stbanana * (totalbananastobuy*(totalbananastobuy+1)/2);
        int amounttoborrow = totalCost - intialdollars;
        if(amounttoborrow < 0){
            System.out.println(0);
        }else{
            System.out.println(amounttoborrow);
        }
        sc.close();
    }
}
