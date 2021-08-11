/* -- Ved -- */

import java.util.*;
import static java.lang.System.out;
public class Luck_Num{
    static public void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0;i<n;i++){
            a[i] = sc.nextInt();
        }
        int answer = 0;
        for(int i = 0;i<n;i++){
            int f = Lucky_Counter(a[i]);
           // int s = counter(a[i]);
            if(f<=k){
                answer++;
            }
        }
        out.println(answer);

    }
    static public int Lucky_Counter(int arr){
        HashMap<Character,Integer> map = new HashMap<>();
        String a = arr+"";
        for(int i = 0;i<a.length();i++){
                if(a.charAt(i) == '4' || a.charAt(i) == '7'){
                    map.put(a.charAt(i), map.getOrDefault(a.charAt(i),0)+1);
                }
        }

        int luckyNumber=0;
        for(int x : map.values()){
            luckyNumber+=x;
        }
        return luckyNumber;

    }
   /* static public int counter(int arr){
        int ans = 0;
        String s = arr+"";
        s = s.replaceAll("4","");
        s = s.replaceAll("7", "");
        ans = s.length();
        return ans;
    }*/
}