/* -- Ved -- */

import java.io.*;
import java.util.*;

public class Maximum_Cost{
    static public void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
            String s = sc.next();
            int ans = a*n;
            if(b>=0){
                ans = ans+b*n;
            }else{
               int  count = 1;
                for(int i = 1;i<n;i++){
                    if(s.charAt(i)!=s.charAt(i-1)){
                        count++;
                    }
                }
                ans = ans +b*(count/2 + 1);
            }
            System.out.println(ans);
        }
        sc.close();
    }
}