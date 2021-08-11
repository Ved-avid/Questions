/* -- Ved -- */

import java.util.*;

public class AverageHeight{
    static public void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[] a = new int[n];
            List<Integer> odd = new LinkedList<>();
            List<Integer> even = new LinkedList<>();

           for(int i = 0;i<n;i++){
                a[i] = sc.nextInt();
                if(a[i]%2 == 0){
                    even.add(a[i]);
               }else{
                    odd.add(a[i]);
                }
           }
            for(int x : even){
                System.out.print(x+" ");
          }
            for(int x : odd){
                System.out.print(x+" ");
           }
            System.out.println();
       }
    }
}