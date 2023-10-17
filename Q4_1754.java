/* 
 * Name - Sai premjeet Das
 * Reg_No - 2241004095
 * PS - https://cses.fi/problemset/task/1754/
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q4_1754 {
	public static void main (String[] args) throws IOException {
		BufferedReader read=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(read.readLine());
        StringBuffer ans=new StringBuffer();
        String []set;
        double a,b;
        for(int i=0;i<t;i++) {
        	set=read.readLine().split(" ");
        	a=Double.parseDouble(set[0]);
        	b=Double.parseDouble(set[1]);
        	
        	double ans2=(2*b-a)/3;
        	if(!(a>2*b || b>2*a) && ans2==(long)ans2) {
        		ans.append("YES\n");
        	}
        	else
        		ans.append("NO\n");
        }
        System.out.println(ans);
        
	}
}
