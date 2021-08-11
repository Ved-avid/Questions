/* -- Ved -- */

import java.io.*;
import java.util.*;

public class PassWord {
    static public void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String[] ss = new String[10];
        for(int i = 0;i<10;i++){
            ss[i] = sc.next();
        }
        String ans="";
        for(int i = 0;i<s.length();i+=10){
            String comp = s.substring(i,i+10);
            for(int j = 0;j<10;j++){
                if(ss[j].equals(comp)){
                    ans+=j;
                }
            }
        }
        System.out.println(ans);
    }    
}
