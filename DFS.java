package Tree;


import java.util.*;
public class DFS{
    static boolean[] visited =  new boolean[1001];
    static public void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<List<Integer>> adj = new ArrayList<>();
        for(int i = 0;i<n+1;i++){
            adj.add(new ArrayList<>());
        }
        for(int i = 0;i<n-1;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            adj.get(a).add(b);
            adj.get(b).add(a);
        }
        List<Integer> dfsPath = new ArrayList<>();
        LinkedList<Integer> index = new LinkedList<>();
        visited[1] = true;
        index.add(1);

        while(!index.isEmpty()){
            int temp = index.poll();
            dfsPath.add(temp);
            for(int el : adj.get(temp)){
                if(!visited[el]){
                    visited[el] = true;
                    index.add(el);
                }
            }
        }
        for(int l : dfsPath){
             System.out.print(l+" ");
        }
        
    }
}
