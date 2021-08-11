/* -- Ved -- */
 
import java.util.*;
 
public class SuperCentralPoint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x = new int[n];
        int[] y = new int[n];
        boolean[] r = new boolean[n];
        boolean[] left = new boolean[n];
        boolean[] u = new boolean[n];
        boolean[] lower = new boolean[n];
        
        for(int i = 0;i<n;i++){
            x[i] = sc.nextInt();
            y[i] =sc.nextInt();
        }
 
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){
                if(j != i){
                    if(x[i] < x[j] && y[i] == y[j]){
                        r[i] = true;
                    }
                    else if(x[i] > x[j] && y[i] == y[j]){
                        left[i] = true;
                    }else if(x[i] == x[j] && y[i] > y[j]){
                        lower[i] = true;
                    }else if(x[i] == x[j] && y[i] < y[j]){
                        u[i] = true;
                    }
                }
            }
        }
        int count = 0;
        for(int i = 0;i<n;i++){
            if(r[i] && left[i] && lower[i] && u[i]){
                count++;
            }
        }
        System.out.println(count);
    }    
}