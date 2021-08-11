
/* -- Ved -- */

import java.io.*;
import java.util.*;

public class Greg_WorkOut{
    static public void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] excercise = new int[3];
        for(int i = 0;i<n;i++){
            a[i] = sc.nextInt();

        }
        for(int i = 0;i<n;i=i+3){
            excercise[0] +=a[i];
        }
        for(int i = 1;i<n;i=i+3){
            excercise[1]+=a[i];
        }
        for(int i = 2;i<n;i=i+3){
            excercise[2] += a[i];
        }

        int max = Integer.MIN_VALUE;
        int ind = -1;
        for(int i = 0;i<3;i++){
            if(excercise[i]>max){
                max = excercise[i];
                ind = i;
            }
        }
        if(ind == 0){
            System.out.println("chest");
        }
        else if(ind == 1){
            System.out.println("biceps");
        }
        else{
            System.out.println("back");
        }
    }
}