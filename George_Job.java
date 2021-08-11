/* -- Ved -- */

import java.util.*;
public class George_Job{
    static public void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        long[] a = new long[n+1];
        for(int i = 1;i<=n;i++){
            a[i] = a[i-1]+sc.nextLong();
        }
        long[][] dp = new long[n+1][k+1];
        long maxx = 0;
        for(int i = 1;i<=k;i++){
            maxx = 0;
            for(int j = m;j<=n;j++){
                dp[j][i] = Math.max(dp[j-m][i-1] + a[j] - a[j-m],maxx);
                maxx = Math.max(maxx,dp[j][i]);
            }
        }
        System.out.println(dp[n][k]);
        sc.close();
    }
}