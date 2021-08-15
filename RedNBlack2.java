/*


As their story unravels, a timeless tale is told once again...

Shirahime, a friend of Mocha's, is keen on playing the music game Arcaea and sharing Mocha interesting puzzles to solve. This day, Shirahime comes up with a new simple puzzle 
and wants Mocha to solve them. However, these puzzles are too easy for Mocha to solve, so she wants you to solve them and tell her the answers. The puzzles are described as 
follow.There are n squares arranged in a row, and each of them can be painted either red or blue.

Among these squares, some of them have been painted already, and the others are blank. You can decide which color to paint on each blank square.

Some pairs of adjacent squares may have the same color, which is imperfect. We define the imperfectness as the number of pairs of adjacent squares that share the same color.

For example, the imperfectness of "BRRRBBR" is 3, with "BB" occurred once and "RR" occurred twice.

Your goal is to minimize the imperfectness and print out the colors of the squares after painting.

Input
Each test contains multiple test cases.

The first line contains a single integer t (1≤t≤100) — the number of test cases. Each test case consists of two lines.

The first line of each test case contains an integer n (1≤n≤100) — the length of the squares row.

The second line of each test case contains a string s with length n, containing characters 'B', 'R' and '?'. Here 'B' stands for a blue square, 'R' for a red square, and '?' 
for a blank square.

Output
For each test case, print a line with a string only containing 'B' and 'R', the colors of the squares after painting, which imperfectness is minimized. If there are multiple
solutions, print any of them.


*/


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
