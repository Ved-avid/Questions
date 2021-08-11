import java.util.*;

public class WithoutZero{
    static public void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        long y = sc.nextLong();
        long c = x+y;
        long X = Long.parseLong((x+"").replaceAll("0",""));
        long Y = Long.parseLong((y+"").replaceAll("0",""));
        long C = Long.parseLong((c+"").replaceAll("0",""));
        System.out.println(X+Y == C?"YES":"NO");


    }
}