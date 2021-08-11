/* -- Ved -- */

import java.lang.*;
import java.io.*;
import java.util.*;

public class Perfect_Permutation{
    static public void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if(x == 1 || (x%2)!=0){
            System.out.println(-1);
            return;
        }
        else if(x>=2){
            System.out.print(2+" "+1);
            for(int i = 1;i<x &&(2*i+1<=x)&& (2*i+2<=x);i++){
                System.out.print(" "+(2*i+2)+" "+(2*i+1));
            }
        }
    }
}