/* -- Ved -- */

import java.io.*;
import java.util.*;

public class Array_Find{
    static public void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int c = 1, size = 0;
            while(n>0){
                size++;
                n = n-c;
                if(n == 0){
                    break;
                }else if(n-c>2){
                    c+=2;
                }else if(n-c == 1){
                    c+=1;
                }else{
                    size++;
                    break;
                }
            }
            System.out.println(size);
        }
        sc.close();
    }
}