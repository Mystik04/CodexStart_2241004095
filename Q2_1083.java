/* 
 * Name - Sai premjeet Das
 * Reg_No - 2241004095
 * PS - https://cses.fi/problemset/task/1083/
 */

import java.util.Scanner;

public class Q2_1083 {
	public static void main(String[] args) {
		Scanner inp=new Scanner(System.in);
		long n=inp.nextLong();
		long sum=0;
		for(int i=0;i<n-1;i++) {
			int num=inp.nextInt();
			sum+=num;
		}
		long ans=((n*(n+1))/2)-sum;
		System.out.println(ans);
		

	}
}
