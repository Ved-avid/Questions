package BitWiseOperation;

import java.util.*;
import java.io.*;

public class TurnOff_K_Shift {
	static public void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int x = sc.nextInt();
		System.out.println("Binary Representation of "+x+" is "+Integer.toBinaryString(x));
		System.out.println("Enter the Bit you want to turnOff ");
		int ind = sc.nextInt();
		//     1<<(ind-1),    if 1100 and ind = 3, then 100 now taking not of 10 -> 001 & 1100 ---> 1000
		
		int ans = (x & (~(1<<(ind-1))));
		System.out.println("Binary Representation of "+ans+" is "+Integer.toBinaryString(ans));
	}
}
