/* -- Ved -- */

import java.util.*;
import java.io.*;

public class T_Prime{
    static public void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int N = 1_000_001;
        boolean[] seive = new boolean[N];
        Arrays.fill(seive,true);
        seive[0] = false;
        seive[1] = false;

        for(int i = 2;i*i<N;i++){
            if(seive[i] == true){
                for(int j = 2;j*i<N;j++){
                    seive[i*j] = false;
                }
            }
        }

        for(int i = 0;i<n;i++){
            long ch = sc.nextLong();
            double root = Math.sqrt(ch);
            int m = (int)root;
            if(m==root){
                if(seive[m]){
                    System.out.println("YES");
                }else{
                    System.out.println("NO");
                }
            }else{
                System.out.println("NO");
            }
        }
        sc.close();
    }
}