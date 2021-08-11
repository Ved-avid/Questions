/* -- Ved -- */

import java.io.*;
import java.util.*;

public class HorseMen{
    static public void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] a = new int[4];
        int count = 0;
        for(int i = 0;i<4;i++){
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        for(int i = 0;i<3;i++){
            if(a[i] == a[i+1]){
                count++;
            }
        }
        System.out.println(count);
    }
}