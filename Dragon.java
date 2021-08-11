/* -- Ved -- */

import java.util.*;
public class Dragon{
    static public void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int n = sc.nextInt();
        List<P> list = new LinkedList<>();
        for(int i = 0;i<n;i++){
            int d = sc.nextInt();
            int b = sc.nextInt();
            list.add(new P(d,b));
        }
        boolean f = true;
        Collections.sort(list, new Sort_p());
        Iterator<P> itr = list.iterator();
        while(itr.hasNext()){
            P ch = (P)itr.next();
            if(ch.dragon < s){
                s+=ch.bonus;
            }else{
                System.out.println("NO");
                f = false;
                break;
            }
        }
        if(f){
            System.out.println("YES");
        }
    }
}
class P{
    int dragon ;
    int bonus ;
    P(int dragon, int bonus){
        this.dragon  = dragon;
        this.bonus = bonus;
    }
}

class Sort_p implements Comparator<P>{
    public int compare(P o1, P o2){
        return ((Integer)o1.dragon).compareTo(o2.dragon);
    }
}