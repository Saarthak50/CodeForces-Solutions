import java.util.*;

public class APangram{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        s = s.toLowerCase();
        HashMap<Character, Integer> map = new HashMap<>();
        for(char ch : s.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }
            
        int keyCount = 0;
        for (Map.Entry<Character, Integer> en : map.entrySet()) {
            Object key = en.getKey();
            keyCount++;
            
        }
        if(keyCount == 26){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
        
        sc.close();

        
    }

}