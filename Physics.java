import java.util.*;
public class Physics{
    static public void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[][] a = new int[t][3];
        for(int i = 0;i<t;i++){
            for(int j = 0;j<3;j++){
                a[i][j] = sc.nextInt();
            }
        }
        int[] sum = new int[3];
        for(int i = 0;i<t;i++){
            sum[0] += a[i][0]; 
        }
        for(int i = 0;i<t;i++){
            sum[1] += a[i][1];
        }
        for(int i = 0;i<t;i++){
            sum[2] += a[i][2];
        }

        boolean f = true;
        for(int i = 0;i<3;i++){
            if(sum[i] != 0){
                f = false;
                break;
            }
        }
        if(f){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}