/* -- Ved -- */

import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
import static java.lang.System.out;
public class Errors{
    static public void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0, temp = 0;
        for(int j = 0;j<3;j++){
            sum=0;
            for(int i = 0;i<n-j;i++){
                sum+=(sc.nextInt());
            }
            if(j>0){
                System.out.println(temp-sum);
            }
            temp=sum;
        }
    }
}
