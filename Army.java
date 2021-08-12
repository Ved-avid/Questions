/* -- Ved -- */
import java.io.IOException;
import java.util.Scanner;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class Army {
    static public void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out),true);
        int n = sc.nextInt();
        int[] d = new int[n+1];
        for(int i = 1;i<n;i++){
            d[i] = sc.nextInt();
        }
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = 0;
        while(a!=b){
            sum+=d[a];
            a++;
        }
        pw.println(sum);
    }
}
