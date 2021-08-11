/* -- Ved -- */

import java.util.*;
import static java.lang.System.out;

public class King_Path{
    static public void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String v = sc.next();
        int x1 = (s.charAt(0)-'0') -49;
        int y1 = 8-(Character.getNumericValue(s.charAt(1)));
        int x2 = (v.charAt(0)-'0')-49;
        int y2 = 8-(Character.getNumericValue(v.charAt(1)));
        List<String> list = new ArrayList<>();
        int step = 0;
        //out.println("Coordinate of King --> "+x1+"  ,  "+y1);
        //out.println("Coordinate of Person --> "+x2+"  ,  "+y2);
       while(x1 != x2 || y1!= y2){
            if(x1 == x2 && y1 < y2){
                list.add("D");
                step++;
                y1++;
            }
            else if(x1 == x2 && y1 > y2){
                list.add("U");
                step++;
                y1--;
            }
            else if(x1 > x2 && y1 == y2){
                list.add("L");
                step++;
                x1--;
            }
            else if(x1<x2 && y1 == y2){
                list.add("R");
                step++;
                x1++;
            }
            else if(x1>x2 && y1<y2){
                list.add("LD");
                step++;
                x1--;
                y1++;
            }
            else if(x1>x2 && y1>y2){
                list.add("LU");
                step++;
                x1--;
                y1--;
            }
            else if(x1<x2 && y1>y2){
                list.add("RU");
                step++;
                x1++;
                y1--;
            }
            else if(x1<x2 && y1 < y2){
                list.add("RD");
                step++;
                x1++;
                y1++;
            }
        }
        System.out.println(step);
        for(String x : list){
            System.out.println(x);
        }
    }
}