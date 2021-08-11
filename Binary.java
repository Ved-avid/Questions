/* -- Ved -- */

import java.io.*;
import java.util.*;



public class Binary{
    static public void main(String[] args) throws IOException{
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(sc.readLine());
        while(t-->0){
            String[] s = sc.readLine().split(" ");
            HashSet<Integer> set = new HashSet<>();
            for(int i = 0;i<s.length;i++){
                int k = Integer.parseInt(s[i]);
                set.add(k);
            }
            ArrayList<Integer> list = new ArrayList<>();
            if(list.size() == 2){
                if(list.get(0) == 0 && list.get(1) == 1){
                    System.out.println(1);
                }else{
                    System.out.println(2);
                }
            }
        }
    }
}