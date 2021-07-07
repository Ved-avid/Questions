import java.util.*;
import java.io.*;
import java.lang.*;

class Shop{
    static public void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[][] visitor = new int[m][2];
            for(int i = 0;i<m;i++){
                visitor[i][0] = sc.nextInt();
                visitor[i][1] = sc.nextInt();
            }
            Map<Integer,Integer> map = new HashMap<>();
            for(int i = 0;i<m;i++){
                for(int j=visitor[i][0];j<=visitor[i][1];j++){
                    if(map.containsKey(j)){
                        map.put(j,map.getOrDefault(j,0)+1);
                    }else{
                        map.put(j,1);
                    }
                }
            }

            Map<Integer, Integer> map2 = sortByValue(map);
            List<Integer> list = new ArrayList<Integer>(map2.keySet());
            for(int i = list.size()-1;i>list.size()-4;i--){
                System.out.print(list.get(i)+" ");
            }
            System.out.println();
        }
    }

    static public HashMap<Integer,Integer> sortByValue(Map<Integer,Integer> m){
        List<Map.Entry<Integer,Integer>> list = new LinkedList<Map.Entry<Integer,Integer>>(m.entrySet());
        Collections.sort(list,new Comparator<Map.Entry<Integer,Integer>>(){
            public int compare(Map.Entry<Integer,Integer> o1, Map.Entry<Integer,Integer> o2){
                return (o1.getValue()).compareTo(o2.getValue());
            }
        });
        HashMap<Integer,Integer> temp = new LinkedHashMap<Integer,Integer>();
        for(Map.Entry<Integer,Integer> l : list){
            temp.put(l.getKey(),l.getValue());
        }
        return temp;

    }
}