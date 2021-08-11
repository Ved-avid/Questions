/* -- Ved -- */

import static java.lang.Integer.MIN_VALUE;
import static java.lang.System.out;
import java.util.*;

public class Tower{
    static public void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i<n;i++){
            int x = sc.nextInt();
            map.put(x, map.getOrDefault(x,0)+1);
        }
        Set<Map.Entry<Integer,Integer>> set = map.entrySet();
        Iterator<Map.Entry<Integer,Integer>> itr = set.iterator();
        int max = MIN_VALUE;
        while(itr.hasNext()){
            Map.Entry<Integer,Integer> value = (Map.Entry<Integer,Integer>)itr.next();
            int v = value.getValue();
           // System.out.println(value.getKey()+" --- "+value.getValue());
            if(v>max){
                max = v;
            }
        }
        out.println(max+" "+set.size());
    }
}
