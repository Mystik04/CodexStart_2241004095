/* 
 * Name - Sai premjeet Das
 * Reg_No - 2241004095
 * PS - https://cses.fi/problemset/task/1069/
 */

import java.util.Scanner;

public class Q3_1069 {
	public static void main(String[] args) {
		Scanner inp=new Scanner(System.in);
		String s=inp.nextLine();
		int len=0,ans=0;
		char c = 0;
		for (int i=0;i<s.length();i++) {
			if(s.charAt(i)!=c) {
				c=s.charAt(i);
				len=0;
			}
			if (s.charAt(i)==c) {
				len++;
			}
			ans=Math.max(ans, len);
		}
		System.out.println(ans);
	}
}
