/* -- Ved -- */

import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
import static java.lang.System.out;
import static java.lang.Integer.MIN_VALUE;

public class Football {
    static public void main(String[] args){
        Map<String, Integer> map = new HashMap<String, Integer>();
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        String s = "";
        sc.nextLine();
        int k = t;
        while(t-->0){
            s = sc.nextLine();
            map.put(s, map.getOrDefault(s,0)+1);
        }
        int max = MIN_VALUE;
        String ans = "";
        for(Map.Entry<String, Integer> e : map.entrySet()){
            if(e.getValue() > max){
                max = e.getValue();
                ans = e.getKey();
            }
        }
        out.println(ans);
    }
}
