/* 
 * Name - Sai premjeet Das
 * Reg_No - 2241004095
 * PS - https://cses.fi/problemset/task/1618/
 */
import java.util.Scanner;

public class Q7_1618 {
	public static void main(String[] args) {
		Scanner inp=new Scanner(System.in);
		long n=inp.nextLong();
		long curr=5;
		long ans=0;
		while(curr<=n) {
			ans+=n/curr;
			curr*=5;
		}
		System.out.println(ans);
	}
}

