import java.util.*;
import java.lang.*;
import java.io.*;

class SortMapByValue{
    static public void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any 10 Numbers [Repition allowed]");
        System.out.println("----OUTPUT-----");
        System.out.println("NUMBER - frequency [IN DESCENDING ORDER]");
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i = 0;i<10;i++){
            int x = sc.nextInt();
            if(map.containsKey(x)){
                map.put(x,map.getOrDefault(x,0)+1);
            }else{
                map.put(x,1);
            }
        }
        HashMap<Integer,Integer> map2 = sortedMap(map);

        for(Map.Entry<Integer,Integer> e : map2.entrySet()){
            System.out.println("Number -- "+e.getKey()+" frequency -- "+e.getValue());
        }
    }

    static public HashMap<Integer,Integer> sortedMap(HashMap<Integer,Integer> m){
        //Convert it into list from element of hashMap

        List<Map.Entry<Integer,Integer>> list = new LinkedList<Map.Entry<Integer,Integer>>(m.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<Integer,Integer>>(){
            public int compare(Map.Entry<Integer,Integer> o1, Map.Entry<Integer,Integer> o2){
                return (o1.getValue().compareTo(o2.getValue()));
            }
        });

        //Convert this list to HashMap
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(Map.Entry<Integer,Integer> a : list){
            map.put(a.getKey(),a.getValue());
        }
        return map;

    }
}