/* -- Ved -- */

import java.util.*;

public class R2{
    static public void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] a = new int[n];
            for(int i = 0;i<n;i++){
                a[i] = sc.nextInt();
            }
            int count = 0;
            for(int i = 0;i<n-1;i++){
                    if(a[i]>a[i+1]){
                        count++;
                    }
            }
           // System.out.println(count+"---");
            if(count<k){
                System.out.println("yes");
            }else{
                System.out.println("no");
            }
        }
    }
}