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