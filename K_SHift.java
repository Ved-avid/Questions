package BitWiseOperation;

import java.lang.*;
import java.io.*;
import java.util.*;

public class K_SHift {
	static public void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		System.out.println("Binary Representation of "+x+" is "+Integer.toBinaryString(x));
		
		System.out.println("Enter the index , which you want to set");
		int set = sc.nextInt();
		int ans = (1<<set)|x;
		System.out.println(" Binary Representation of "+ans+" is "+Integer.toBinaryString(ans));
	}
}
