/* -- Ved -- */

import java.util.*;
import static java.lang.System.out;
public class Petya_String{
    static public void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().toLowerCase();
        String n = sc.nextLine().toLowerCase();
        int check = s.compareTo(n);
        if(check>0){
            out.println(1);
        }
        else if(check<0){
            out.println(-1);
        }
        else{
            out.println(0);
        }
    }
}