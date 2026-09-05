import java.util.Scanner;

public class contest1119 {
    public static void main(String[] args) {
        // Scanner sc=new Scanner(System.in);
        // int t=sc.nextInt();
        // while(t-- >0){
        //     int n=sc.nextInt();//no of fields
        //     int k=sc.nextInt(); // size of farm
        //     String s=sc.next();

        //     int count = 0;
        //     for(int i=0;i<n;i+=k){ //jump to next farm
        //         boolean zero=false;
        //         for(int j=i;j<i+k;j++){ //uss farm se start
        //             if(s.charAt(j) =='0')
        //                 zero = true;
        //         }
        //         if(!zero){
        //             count++;
        //         }

        //     }
        //     System.out.println(count);
        // }

        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0){
            int n=sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int odd=0;
            int even0=0;
            int even2=0;
            for(int num:arr){
                if(num%2!=0){
                    odd++;
                }else if(num%4 == 0){
                    even0++;
                }else{
                    even2++;
                }
            }
            System.out.println(Math.max(Math.max(even0, even2), odd));

        }
        sc.close();
    }
}
