/* -- ved -- */

import java.util.*;
import static java.lang.System.out;

public class Soldier {
    static public void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] soldier = new int[size];

        for(int i = 0;i<size;i++){
            soldier[i] = sc.nextInt();
        }

        int first = 1, second = size;
        int min = (int)Math.abs(soldier[0] - soldier[size-1]);
        for(int i = 0;i<size-1;i++){
            int d = (int)Math.abs(soldier[i] - soldier[i+1]);
            if( d < min){
                min = d;
                first = i+1;
                second = i+2;
            }
        }

        out.println(first+" "+second);
    }
}
