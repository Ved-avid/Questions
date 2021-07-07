import java.util.*;
import java.lang.*;
import java.io.*;

class Shop1{
    static public void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] visit = new int[m][2];
        for(int i = 0;i<m;i++){
            visit[i][0] = sc.nextInt();
            visit[i][1] = sc.nextInt();
        }
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i = 0;i<m;i++){
            for(int j = visit[i][0];j<=visit[i][1];j++){
                if(map.containsKey(j)){
                    map.put(j,map.getOrDefault(j,0)+1);
                }else{
                    map.put(j,1);
                }
            }
        }
        int ch = Integer.MIN_VALUE;
        int ans1=-1, ans2=-1,ans3=-1;
        for(Map.Entry<Integer,Integer> e: map.entrySet()){
            if(e.getValue()>ch){
                ch = e.getValue();
                ans1=e.getKey();
            }
        }
        map.replace(ans1,0);
        ch = Integer.MIN_VALUE;
        for(Map.Entry<Integer,Integer> e: map.entrySet()){
            if(e.getValue()>ch){
                ch = e.getValue();
                ans2=e.getKey();
            }
        }
        map.replace(ans2,0);
        ch = Integer.MIN_VALUE;
        for(Map.Entry<Integer,Integer> e: map.entrySet()){
            if(e.getValue()>ch){
                ch = e.getValue();
                ans3=e.getKey();
            }
        }
        System.out.println(ans1+" "+ans2+" "+ans3);
    }
}