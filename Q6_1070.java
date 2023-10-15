/* 
 * Name - Sai premjeet Das
 * Reg_No - 2241004095
 * PS - https://cses.fi/problemset/task/1070/
 */

import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Q6_1070{
	public static BufferedReader br;
	public static StringTokenizer st;
	public static FastReader in=new FastReader();
	public static int n=in.nextInt();
	public static StringBuffer ans=new StringBuffer();
	
	public static void main(String[] args) {
		if(n==1) {
			System.out.println(1);
			System.exit(0);
		}
		if(n<=3) {
			System.out.println("NO SOLUTION");
			System.exit(0);
		}
		
		int i=2;
		while(i<=n) {
			ans.append(i);
			ans.append(" ");
			i+=2;
		}
		
		i=1;
		while(i<=n) {
			ans.append(i);
			ans.append(" ");
			i+=2;
		}
		
		System.out.println(ans);
	}
	
	static class FastReader{
		public FastReader() {
			br=new BufferedReader(new InputStreamReader(System.in));
		}
		String next(){
			while(st==null || !st.hasMoreElements()) {					
				try {					
					st=new StringTokenizer(br.readLine());
				}
				catch(IOException e) {
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}
		int nextInt() {
			return Integer.parseInt(next());
		}
	}
}
