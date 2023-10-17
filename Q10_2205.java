/* 
 * Name - Sai premjeet Das
 * Reg_No - 2241004095
 * PS - https://cses.fi/problemset/task/2205/
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Vector;
public class Q10_2205 {

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        Vector<String> gc=new Vector<>();
        gc.add(0+"");
        gc.add(1+"");
        for(int i=1;i<n;i++) {
        	Vector<String> set1=new Vector<>();
        	for(int j=0;j<gc.size();j++) {
        		set1.add(0+gc.get(j));
        	}
        	for(int j=gc.size()-1;j>=0;j--) {
        		set1.add(1+gc.get(j));
        	}
        	gc.clear();
        	gc.addAll(set1);
        }
        for(int i=0;i<gc.size();i++) {
        	System.out.println(gc.get(i));
        }
        

	}

}
