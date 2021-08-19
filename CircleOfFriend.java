
/*

     https://codeforces.com/contest/1560/problem/B
     
*/


     


import java.util.*;
import static java.lang.System.out;

public class CircleOfFriend {
    static public void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n =  sc.nextInt();
        while(n-->0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int range = (int)Math.abs(a-b)*2;
            if(a>range || b> range || c> range){
                out.println(-1);
            }else{
                int diff = (int)Math.abs(a-b);
                out.println(c<=diff? c+diff:c-diff);
            }
        }

    
           
    }    
}
