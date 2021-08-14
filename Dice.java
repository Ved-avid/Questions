package april;
import java.io.*;
import java.util.*;


public class Dice {
	static public void main(String[] args) throws IOException{
		BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		int t = integer(input.readLine());
		for(int test = 0;test<t;test++) {
			long dice = longg(input.readLine());
			long ans = countSum(dice);
			output.write(ans+"\n");
		}output.flush();
	}
	static public long countSum(long n) {
		long h = n/4;
		long pip = 0;
		if(n%4 == 0) {
			pip=60;
			if(h>=1) {
				pip+=(11*(h-1)*4);
				return pip;
			}else {
				return pip;
			}
		}else if(n%4 == 3){
			pip = 51;
			if(h>=1) {
				pip+=48;
				pip+=(11*(h-1)*4);
				return pip;
			}else {
				return pip;
			}
		}else if(n%4 == 2) {
			pip = 36;
			if(h>=1) {
				pip+=52;
				pip+=(11*(h-1)*4);
				return pip;
			}else {
				return pip;
			}
		}else {
			pip = 20;
			if(h>=1) {
				pip+=56;
				pip+=(11*(h-1)*4);
				return pip;
			}else {
				return pip;
			}
		}
	}
	static public int integer(String s) {
		return Integer.parseInt(s);
	}
	static public long longg(String s) {
		return Long.parseLong(s);
	}
}
