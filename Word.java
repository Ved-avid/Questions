
/* -- Ved -- */

import java.lang.*;
import java.util.*;
import java.io.*;

public class Word{
    static public void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int lower = 0, upper = 0;
        for(int i = 0;i<s.length();i++){
            int ascii = (int)s.charAt(i);
            if(ascii>=97 && ascii <=122 ){
                lower++;
            }else{
                upper++;
            }
        }
        String ans="";
        if(lower>=upper){
            ans = s.toLowerCase();
        }else{
            ans = s.toUpperCase();
        }
        System.out.println(ans);
    }
}