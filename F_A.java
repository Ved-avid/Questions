/* -- Ved -- */

import java.io.*;
import java.util.*;

public class F_A{
    static public void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int count = 0, val =1, sum = 0;
            while(sum+val<n){
                count++;
                sum+=val;
                val+=2;
            }
            count++;
            System.out.println(count);
        }
        sc.close();
    }
}