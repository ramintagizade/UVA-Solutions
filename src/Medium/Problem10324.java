package Medium;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by Ramin Tagizade
 * on Aug 12 , 2018
 * 10:12 AM
 */
public class Problem10324 {


    public void solve() throws Exception{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String line = null;

        int cases = 0;
        while((line=bufferedReader.readLine())!=null) {

            if(line==null || line.isEmpty()) break;

            cases++;
            String sequence = line;
            int len = sequence.length();
            int n = Integer.parseInt(bufferedReader.readLine());

            int [] dp = new int[len];
            dp[0] = 0;

            for(int i=1;i<len;i++) {
                dp[i] = dp[i-1] + Math.abs(sequence.charAt(i)-sequence.charAt(i-1));
            }

            System.out.println("Case "+cases+":");
            for(int i=0;i<n;i++) {
                String  [] params = bufferedReader.readLine().split(" ");
                int ii = Integer.parseInt(params[0]);
                int jj = Integer.parseInt(params[1]);

                if(ii > jj) {
                    int temp = jj;
                    jj = ii;
                    ii = temp;
                }

                if(dp[ii]!=dp[jj]) {
                    System.out.println("No");
                }
                else {
                    System.out.println("Yes");
                }
            }
        }
    }

    public static void main (String [] args ) throws Exception{
        Problem10324 problem10324 = new Problem10324();
        problem10324.solve();
    }
}
