/* -- Ved --*/

import java.io.*;
import java.util.Arrays;

public class UserName2{
    static public void main(String[] args) throws IOException{
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(input);
        OutputStreamWriter output = new OutputStreamWriter(System.out);
        PrintWriter pw = new PrintWriter(output,true);
            int n = getInt(br.readLine());
            String[] s = br.readLine().split(" ");
            int[] a = new int[s.length];
            int ind = 0;
            for (String ss : s) {
                a[ind++] = getInt(ss);
            }

            int best = a[0];
            int worst = a[0];
            int point = 0;
            for (int i = 1; i < n; i++) {
                if (a[i] > best) {
                    best = a[i];
                    point++;
                } else if (a[i] < worst) {
                    worst = a[i];
                    point++;
                }
            }
            pw.println(point);
    }

    static public int  getInt(String s){
        return Integer.parseInt(s);
    }
}
