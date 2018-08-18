package Medium;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by Ramin Tagizade
 * on Aug 18 , 2018
 * 11:10 PM
 */

public class Problem11586 {

    public void solve() throws Exception{

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String line = null;

        while((line=bufferedReader.readLine())!=null) {
            int n = Integer.parseInt(line);

            for(int i=0;i<n;i++) {
                String str = bufferedReader.readLine();
                int m = 0;
                int f = 0;
                for(int j=0;j<str.length();j++) {
                    if(str.charAt(j)=='M') {
                        m++;
                    }
                    else if(str.charAt(j)=='F'){
                        f++;
                    }
                }
                if(Math.abs(m-f)==0 && (m+f)>3){
                    System.out.println("LOOP");
                }
                else {
                    System.out.println("NO LOOP");
                }
            }

            break;
        }
    }

    public static void main (String [] args ) throws Exception{
        Problem11586 problem11586 = new Problem11586();
        problem11586.solve();
    }
}
