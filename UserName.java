 /* -- Ved -- */

import java.util.*;
import static java.lang.System.out;

public class UserName {
    static public void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] score = new int[n];
        for(int i = 0;i<n;i++){
            score[i] = sc.nextInt();
        }

        int best = score[0];
        int worst = score[0];
        int point = 0;
        for(int i = 1;i < n;i++){
            if(score[i] > best){
                 best = score[i];
                 point++;
            }
            else if(score[i] < worst){
                worst = score[i];
                point++;
            }
        }
        out.println(point);
    }
}
