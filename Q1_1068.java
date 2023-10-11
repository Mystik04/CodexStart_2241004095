/* 
 * Name - Sai premjeet Das
 * Reg_No - 2241004095
 * PS - https://cses.fi/problemset/task/1068/
 */

import java.util.Scanner;
public class Q1_1068 {
	public static void main(String[] args) {
		Scanner inp=new Scanner(System.in);
		long n=inp.nextLong();
		Weird_Algo(n);
	}	
	static void Weird_Algo(long num) {
		System.out.print(num+" ");
		while(num>1) {
			if(num%2==0) {
				num=num/2;
				System.out.print(num+" ");
			}
			else if(num%2!=0) {
				num=(num*3)+1;
				System.out.print(num+" ");
			}
		}
	}
}
