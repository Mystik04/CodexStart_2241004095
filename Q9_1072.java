/* 
 * Name - Sai premjeet Das
 * Reg_No - 2241004095
 * PS - https://cses.fi/problemset/task/1072/
 */

import java.util.Scanner;
public class Q9_1072 {

	public static void main(String[] args) {
		Scanner inp=new Scanner(System.in);
		long n=inp.nextLong();
		System.out.println(0);
		for(int i=2;i<=n;i++) {
			long p=(long)Math.pow(i,2);
			long ans=((p*(p-1))/2)-(4*(i-2)*(i-1));
			System.out.println(ans);
		}
	}

}
