/* 
 * Name - Sai premjeet Das
 * Reg_No - 2241004095
 * PS - https://cses.fi/problemset/task/1071/
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q8_1071{
	public static void main (String[] args) throws IOException {
		BufferedReader read=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(read.readLine());
        while(t>0) {
        	String []set=read.readLine().split(" ");
        	long x=Long.parseLong(set[0]);
        	long y=Long.parseLong(set[1]);
        	long ans;
        	if(y>x) {
        		if(y%2==0)
        			ans=((y-1)*(y-1))+1+(x-1);
        		else
        			ans=(y*y)-(x-1);
        	}
        	else {
        		if(x%2==0)
        			ans=((x-1)*(x-1))+1+(x-1)+(x-y);
        		else
        			ans=(x*x)-(x-1)-(x-y);
        	}
        	System.out.println(ans);
        	t=t-1;
        }
        
	}
}
