/* -- Ved -- */

import java.io.*;
import java.util.*;

public class K_String{
    static public void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();
        int n = s.length();
            char[] ch = new char[n];
            int[] a = new int[n];
            int[] b = new int[n];
            for(int i = 0;i<n-1;i++){
                if(a[i]!=-1){
                    for(int j = i+1;j<n;j++){
                       if(s.charAt(i) == s.charAt(j)){
                        a[i]++;
                        a[j]=-1;
                       }
                    }
                }
            }
            int m = 0;
            int dis = 0;
            for(int i = 0;i<n;i++){
                a[i]++;
                if(a[i] != 0){
                    ch[m] = s.charAt(i);
                    b[m] = a[i];
                    dis++;
                    m++;
                }
            }

            int flag = 1;
            for(int i = 0;i<a.length;i++){
                if(a[i]%t != 0){
                    System.out.println(-1);
                    flag = 0;
                    break;
                }
            }
            if(flag==1){
                for(int p = 0;p<t;p++){
                    for(int q = 0;q<m;q++){
                        for(int z = 0;z<b[q]/t;z++){
                            System.out.print(ch[q]);
                        }
                    }
                }
            }
    }
}