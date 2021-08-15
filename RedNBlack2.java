/* -- Ved -- */
import java.util.Scanner;
import java.util.LinkedList;
import java.util.List;

public class RedNBlack2 {
    static public void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            sc.nextLine();
            String s = sc.nextLine();
            if(s.length() == 1){
                if(s.charAt(0) == '?'){
                    String ans = "B";
                    System.out.println(ans);
                }else{
                    System.out.println(s);
                }
            }
            else{
                char[] a = new char[n];
                List<Integer> index = new LinkedList<>();
                for(int i = 0;i<n;i++){
                    a[i] = s.charAt(i);
                    if(a[i] != '?'){
                        index.add(i);
                    }
                }
              
    
                int l = index.size();
                if(l == 0){
                  
                    String ans="";
                    for(int i = 0;i<n;i++){
                        if(i%2 == 0){
                            ans+="R";
                        }else{
                            ans+="B";
                        }
                    }
                    System.out.println(ans);
                }
                else{
                    for(int i = 0;i<l;i++){
                        if(i==0){
                            int ind = index.get(i);
                            if(a[ind] == 'R'){
                                if(ind%2 != 0){
                                    for(int k = 0;k<ind;k++){
                                        if(k%2 == 0){
                                            a[k] = 'B';
                                        }else{
                                            a[k] = 'R';
                                        }
                                    }
                                }else{
                                    for(int k = 0;k<ind;k++){
                                        if(k%2 == 0){
                                            a[k] = 'R';
                                        }else{
                                            a[k] = 'B';
                                        }
                                    }
                                }
                            }
                            else{
                                if(ind%2 != 0){
                                    for(int k = 0;k<ind;k++){
                                        if(k%2 == 0){
                                            a[k] = 'R';
                                        }else{
                                            a[k] = 'B';
                                        }
                                    }
                                }else{
                                    for(int k = 0;k<ind;k++){
                                        if(k%2 == 0){
                                            a[k] = 'B';
                                        }else{
                                            a[k] = 'R';
                                        }
                                    }
                                }

                            }
                        }
                        else if(i>0){
                            int prev = i-1;
                            int current = i;
                            int currentIndex = index.get(current);
                            int prevIndex = index.get(prev);
                            int number = currentIndex-prevIndex-1;
                            if(number>0){
                                if(a[prevIndex]=='R' && a[currentIndex] == 'R'){
                                    for(int z = 1;z<=number;z++){
                                        if(z%2 == 0){
                                            a[prevIndex + z] = a[prevIndex];
                                        }else{
                                            a[prevIndex + z] = 'B';
                                        }
                                    }
                            }
                            else if(a[prevIndex]=='B' && a[currentIndex] == 'B'){
                                for(int z = 1;z<=number;z++){
                                    if(z%2 == 0){
                                        a[prevIndex + z] = a[prevIndex];
                                    }else{
                                        a[prevIndex + z] = 'R';
                                    }
                                }
                            }
                            else{
                                if(number%2 != 0){
                                    for(int z = 0;z<=number;z++){
                                        if(z%2 == 0){
                                            a[prevIndex + z] = a[prevIndex];
                                        }else{
                                            a[prevIndex + z] = a[currentIndex];
                                        }
                                    }
                            }else{
                                //System.out.println("First -- >"+a[prevIndex]);
                               // System.out.println("Second -- >"+a[currentIndex]);
                                for(int z = 1;z<=number;z++){
                                    if(z%2 != 0){
                                        a[prevIndex + z] = a[currentIndex];
                                    }else{
                                        a[prevIndex + z] = a[prevIndex];
                                    }
                                }
                            }
                            }
                           
                            }
                        }
                    }
                    int i = (index.size()-1);
                    if(index.get(i)<n){
                      //  int prev = index.get(i);
                      //  int current = n;
                        int prevIndex = index.get(i);
                        int number = n-prevIndex-1;
                        if(number%2 != 0){
                                for(int z = 1;z<=number;z++){
                                    if(z%2 != 0){
                                        a[prevIndex + z] = a[prevIndex] == 'R'?'B':'R';
                                    }else{
                                        a[prevIndex + z] = a[prevIndex] == 'R'?'R':'B';
                                    }
                                }
                            }
                        else{
                                for(int z = 1;z<=number;z++){
                                    if(z%2 != 0){
                                        a[prevIndex + z] = a[prevIndex] == 'R'?'B':'R';
                                    }else{
                                        a[prevIndex + z] = a[prevIndex] == 'R'?'R':'B';
                                    }
                                }
                            
                        }
                        
                    }
                    String ans = "";
                    for(int j = 0;j<n;j++){
                        ans+=Character.toString(a[j]);
                    }
                    System.out.println(ans);
                }
            }
           
        }
    }    
}
