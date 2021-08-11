/* -- Ved -- */

import java.util.*;
public class Lucky_Num{
    static public void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i = 0;i<s.length();i++){
            char c = s.charAt(i);
            map.put(c, map.getOrDefault(c,0)+1);
        }
        int x = map.getOrDefault('4',0);
        int y = map.getOrDefault('7',0);
            String sum = (x+y)+"";
           // System.out.println("SUM -> "+sum);
            Set<Character> set =new HashSet<>();
            for(int i = 0;i<sum.length();i++){
                set.add(sum.charAt(i));
            }
            //System.out.println(set);
            if(set.size() == 1){
                if(set.contains('4') || set.contains('7')){
                    System.out.println("YES");
                }else{
                    System.out.println("NO");
                }
            }
            else if(set.size()>2 || set.size()<2){
                System.out.println("NO");
            }else{
                if(set.contains('4') && set.contains('7')){
                    System.out.println("YES");
                }else{
                    System.out.println("NO");
                }
            }
    }
}