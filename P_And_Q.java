// enter P and Q , and swap the pth and qth bit

package BitWiseOperation;

import java.util.*;
import java.io.*;
public class P_And_Q {
	static public void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number ");
		int x = sc.nextInt();
		System.out.println("Binary Representation of "+x+" is "+Integer.toBinaryString(x));
		System.out.println("Enter two bits you want to swap ");
		int p = sc.nextInt();
		int q = sc.nextInt();
		
		// check whether they are set or not
		
		int f = (x & (1<<(p-1)));
		int d = (x & (1<<(q-1)));
		System.out.println("f -- > "+f+" d -- >"+d);
		if(f>0 && d>0) {
			System.out.println("Now Binary Representation is "+Integer.toBinaryString(x));
		}
		else if(f>0 && d==0) {
			x = x &( ~(1<<(p-1)));
			x = x |(1 << (q-1));
			System.out.println("Now Binary Representation is "+Integer.toBinaryString(x));
		}
		else if( f== 0 && d>0) {
			x = x | (1<<(p-1));
			x = x &(~(1<<(q-1)));
			System.out.println("Now Binary Representation is "+Integer.toBinaryString(x));
		}else {
			System.out.println("Now the binary Representation is "+Integer.toBinaryString(x));
		}
	}
}
