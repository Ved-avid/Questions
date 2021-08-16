/*

Ternary numeric notation is quite popular in Berland. To telegraph the ternary number the Borze alphabet is used. Digit 0 is transmitted as «.», 1 as «-.» and 2 as «--». 
You are to decode the Borze code, i.e. to find out the ternary number given its representation in Borze alphabet.

Input
The first line contains a number in Borze code. The length of the string is between 1 and 200 characters. It's guaranteed that the given string is a valid Borze code of
some ternary number (this number can have leading zeroes).

Output
Output the decoded ternary number. It can have leading zeroes.

.-.--
012


--.
20

-..-.--
1012


*/



/* -- Ved -- */

import java.util.*;

public class Borze{
    static public void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String ans="";
        for(int i = 0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch=='-'){
                if(i<s.length()-1){
                    if(s.charAt(i+1) == '.'){
                        ans+="1";
                        i++;
                    }else if(s.charAt(i+1) == '-'){
                        ans+="2";
                        i++;
                    }
                }
            }else{
                ans+="0";
            }
        }

        System.out.println(ans);
    }
}
