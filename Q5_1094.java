/* 
 * Name - Sai premjeet Das
 * Reg_No - 2241004095
 * PS - https://cses.fi/problemset/task/1094/
 */

import java.util.Scanner;

public class Q5_1094 {
	public static void main(String[] args) {
		long ctr=0;
		Scanner inp=new Scanner(System.in);
		long n=inp.nextLong();
		long arr[]=new long[(int) n];
		for(int i=0;i<n;i++) {
			arr[i]=inp.nextInt();
		}
		for(int i=1;i<n;i++) {
			if(arr[i]<arr[i-1]) {
				ctr=ctr+(arr[i-1]-arr[i]);
				arr[i]=arr[i]+(arr[i-1]-arr[i]);
			}
			if(arr[i]>=arr[i-1]) {
				continue;
			}
		}
		System.out.println(ctr);

	}

}
