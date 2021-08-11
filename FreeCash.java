
/* -- Ved -- */

import java.io.*;
import java.lang.*;
import java.util.*;

public class FreeCash{
    static public void main(String[] args){
        Scanner sc = new Scanner(System.in);
        HashSet<Time> list = new HashSet<>();
        int n = sc.nextInt();
        int count=1;
        for(int i = 0;i<n;i++){
            int h = sc.nextInt();
            int m = sc.nextInt();
            Time t = new Time(h,m);
            if(list.contains(t)){
                count++;
            }else{
                list.add(t);
            }
        }
        System.out.println(count);
    }
}
class Time{
    int h;
    int m;
    Time(int h,int m){
        this.h = h;
        this.m = m;
    }
}