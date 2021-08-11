/* -- Ved -- */
import java.util.*;
public class Drink {
    static public void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[] a = new int[t];
        for(int i = 0;i<t;i++){
            a[i] = sc.nextInt();
        }
        double sum = 0;
        for(int c : a){
            sum+=((double)c/(double)100);
        }
       // System.out.println("Sum "+sum);
        double ans = sum/(double)t;
        System.out.println(ans*100);
    }    
}
