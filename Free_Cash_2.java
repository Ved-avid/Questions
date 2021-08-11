
/* -- Ved -- */

import java.util.*;
import java.io.*;

public class Free_Cash_2{
    static public void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 1, max = 1;
        int prevH = sc.nextInt();
        int prevM = sc.nextInt();
        for(int i = 1;i<n;i++){
            int h = sc.nextInt();
            int m = sc.nextInt();
            if(prevH == h && prevM == m){
                count++;
            }else{
                count=1;
            }
            if(count>max){
                max = count;
            }

            prevH = h;
            prevM = m;
        }
        System.out.println(max);
        sc.close();
    }
}