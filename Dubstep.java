/* -- Ved -- */

import java.io.*;
import java.util.*;
public class Dubstep{
    static public void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String song = br.readLine();
        song = song.replace("WUB"," ").trim();
        System.out.println(song);
    }
}
