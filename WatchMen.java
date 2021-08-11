/* -- Ved -- */

import java.awt.Point;
import java.util.HashMap;
import java.util.Scanner;
import static java.lang.System.out;

public class WatchMen{
    static public void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashMap<Integer,Integer> x = new HashMap<>();
        HashMap<Integer,Integer> y = new HashMap<>();
        HashMap<Point,Integer> present = new HashMap<>();
        long count = 0;
        for(int i = 0;i<n;i++){
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            Point p = new Point(x1, y1);
            x.put(x1, x.getOrDefault(x1, 0)+1);
            y.put(y1, y.getOrDefault(y1, 0)+1);
            if(!present.keySet().contains(p)){
                present.put(p,1);
            }else{
                count -= present.get(p);
                present.put(p, present.get(p)+1);
            }
        }
        for(int i : x.values()){
            count += ((long)(i-1)*(long)i)/2L;
        }
        for(int i : y.values()){
            count += ((long)(i-1)*(long)i)/2L;
        }
        System.out.println(count);

    }
}