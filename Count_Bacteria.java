/* -- Ved -- */

import java.util.*;
public class Count_Bacteria{
    static public void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        while(n>0){
            if((n&1)>0){
                count++;
            }
            n=n>>1;
        }
        System.out.println(count);
    }
}