/* -- Ved -- */

import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
import static java.lang.System.out;
public class ChatRoom {
    static public void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] ch = {'h','e','l','l','o'};
        String s = sc.nextLine();
        StringBuilder str = new StringBuilder("");
        int ind = 0;
        for(int i = 0;i<s.length();i++){
            int check = s.charAt(i);
            if(ind < ch.length && check == ch[ind]){
                str.append(Character.toString(check));
                ind++;
            }
            else if(ind >= ch.length){
                break;
            }
        }
        String f = str.toString();
       // out.println(f);
        if(f.equals("hello")){
            out.println("YES");
        }else{
            out.println("NO");
        }

    }
}
