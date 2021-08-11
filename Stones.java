/* -- Ved --*/

import java.io.*;
import java.util.*;
import static java.lang.System.out;


public class Stones{
    static public void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        String s = br.readLine();
        char[] a = s.toCharArray();
        int n = a.length;
        int count = 0, temp = 0;
        for(int i = 0;i<n-1;i++){
            if(a[i] == a[i+1]){
                temp++;
            }
       }
       out.println(temp);
    }
}