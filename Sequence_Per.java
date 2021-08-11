/* -- Ved * --*/

import java.io.*;
import java.util.*;
public class Sequence_Per{
    static public void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int x = sc.nextInt();
            String pass = sc.nextLine();
            String s = sc.nextLine();
            char[] a = s.toCharArray();
            char[] b = s.toCharArray();
            Arrays.sort(b);
            int p = 0;
            for(int i = 0;i<a.length;i++){
                if(a[i] != b[i]){
                    p++;
                }
            }
            System.out.println(p);
        }
    }
}