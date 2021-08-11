/* -- Ved -- */

import static java.lang.System.out;
import java.util.*;

public class Almost_Prime{
    static boolean[] prime = new boolean[10000];
    static public void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;
        Arrays.fill(prime,true);
        prime[0] = false;
        prime[1] = false;
        for(int i = 2;i*i<10000;i++){
            if(prime[i]){
                for(int j = 2;j*i<10000;j++){
                    prime[j*i] = false;
                }
            }
        }
        for(int i = 2;i<=n;i++){
            if(is_Almost_Prime(i)){
                ans++;
            }
        }
        out.println(ans);
    }

    static boolean is_Almost_Prime(int n){
        int count =0;
        for(int i = 2;i<10000;i++){
            if(prime[i]==true){
                if(n%i == 0){
                    count++;
                }
            }
        }
        if(count==2){
            return true;
        }else{
            return false;
        }
    }
}