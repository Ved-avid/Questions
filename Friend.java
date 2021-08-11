/* -- Ved -- */

import java.io.*;
import java.util.*;

public class Friend {
    static public void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[] a = new int[6];
        while(t-->0){
            int x = sc.nextInt();
            int y = sc.nextInt();
            a[x]++;
            a[y]++;
        }

        for(int i = 1;i<6;i++){
            if(a[i]>2 || a[i]<2){
                System.out.println("WIN");
                return;
            }
        }
        System.out.println("FAIL");

      
    }    
}
