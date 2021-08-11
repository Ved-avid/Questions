/* -- Ved -- */

import java.util.*;
public class Sunday_2{
    static public void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[m+1];
        for(int i = 0;i<m+1;i++){
            a[i] = sc.nextInt();
        }
        int alex = a[m];
        int friends = 0;
        for(int i = 0;i<m;i++){
            int check = alex^a[i];
            if(countBit(check) <= k){
                friends++;
            }
        }
        System.out.println(friends);
    }
    static int countBit(int n){
        int count = 0;
        while(n>0){
            if((n&1) >0){
                count++;
            }
            n=n>>1;
        }
        return count;
    }
}