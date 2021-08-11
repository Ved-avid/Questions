/* -- Ved -- */

import java.util.*;
import static java.lang.Integer.*;
import static java.lang.System.out;

public class Marathon{
    static public void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[][] a = new int[n][5];
            for(int i = 0;i<n;i++){
                for(int j = 0;j<5;j++){
                    a[i][j] = sc.nextInt();
                }
            }
            if(n == 1){
                System.out.println(1);
            }
            else{
               // Set<Integer> losers = new HashSet<>();
               int[] player = new int[n];
                for(int j = 0;j<5;j++){
                 int min = MAX_VALUE;
                    int ind = 0;
                    for(int i = 0;i<n;i++){
                        if(a[i][j]<min){
                            min = a[i][j];
                            ind = i;
                        }
                    }
                    player[ind]++;
              }
              for(int x : player){
                  System.out.print(x+"  ");
              }
              System.out.println();
                int ans = -1;
                int min = 1;
                for(int i = 0;i<n;i++){
                    if(player[i]>min){
                        min = player[i];
                        ans = i+1;
                    }
                    else if(player[i] == min){
                        ans=-1;
                        break;
                    }
                }
                out.println(ans);
            }
        }
    }
}
