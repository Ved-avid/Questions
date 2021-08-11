/* -- Ved -- */
import java.util.*;

public class R1 {
    static public void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            double[] a = new double[n];
            for(int i = 0;i<n;i++){
                a[i] = sc.nextDouble();
            }
            double m = maxx(a);
           // System.out.println(m);
            answer(a,m);
        }
    }   
    
    static double maxx(double[] a){
        double max = -100000000000.00;
        int ind = -1;
        int n = a.length;
        for(int i = 0;i<n;i++){
            if(a[i] > max){
                max = a[i];
                ind = i;
            }
        }
       // System.out.println("index -> "+ind);
        if(ind != -1){
            a[ind] =0;
        }
        return max;
    } 

    static void answer(double[] a, double maxx){
        double sum = 0;
        int n = a.length;
        for(int i = 0;i<n;i++){
            sum+=a[i];
        }
       // System.out.println("Sum ->" +sum);
        double av = sum/(double)(n-1);
        System.out.println(String.format("%.9f",(av+maxx)));
    } 
}
