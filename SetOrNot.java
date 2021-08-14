// To check if the required bit is 1 or 0
package BitWiseOperation;

import java.io.*;
import java.util.*;

public class SetOrNot {
	static public void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int x = sc.nextInt();
		System.out.println("Enter the bit you want to check");
		int c = sc.nextInt();
		int f = x & (1<<(c-1));
		if(f == 0) {
			System.out.println("It is Off "+Integer.toBinaryString(x));
		}else {
			System.out.println("It is On "+Integer.toBinaryString(x));
		}
	}
}
