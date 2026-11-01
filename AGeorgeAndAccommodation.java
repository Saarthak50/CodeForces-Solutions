import java.util.*;
public class AGeorgeAndAccommodation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rooms=0;
        while(n-- >0){

            
            int p = sc.nextInt();
            int q=sc.nextInt();
            if(q-p>=2){
                rooms++;
            }
        }
        System.out.println(rooms);

    }
}
