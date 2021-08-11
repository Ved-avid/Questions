/* -- Ved -- */

import static java.lang.System.out;
import static java.lang.Integer.MAX_VALUE;
import java.util.*;

public class Reconnaisance{
    static public void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0;i<n;i++){
            a[i] = sc.nextInt();
        }
        int min_diff = MAX_VALUE;
        int first = -1;
        int last = -1;
        for(int i = 0;i<n-1;i++){
            for(int j = i+1;j<n;j++){
                int diff = (int)Math.abs(a[i]-a[j]);
                if(diff<min_diff){
                    min_diff = diff;
                    first = i+1;
                    last = j+1;
                }
            }
        }
        if(first == 1 && last == n){
            out.println(n+" "+1);
        }
        else{
            out.println(first+" "+last);
        }
    }
}