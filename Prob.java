/* -- Ved -- */

import java.util.*;
import static java.lang.System.out;

public class Prob{
    static public void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] ans = {"","1/1","5/6","2/3","1/2","1/3","1/6"};
        int ind = (int)Math.max(sc.nextInt(), sc.nextInt());
        out.println(ans[ind]);
    }
}