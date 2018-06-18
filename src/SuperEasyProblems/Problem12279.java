package SuperEasyProblems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Problem link :
 * @see <a href="https://uva.onlinejudge.org/index.php?option=com_onlinejudge&Itemid=8&category=244&page=show_problem&problem=3431"></a>
 */

public class Problem12279 {
    public static void main (String [] args ) throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String line = null;

        int n = -1;
        boolean ok = true;
        int cases = 1;
        while((line=bufferedReader.readLine())!=null && !line.equals("0")) {
            int ans = 0;
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine()," ");
            while(stringTokenizer.hasMoreTokens()) {
                if(Integer.parseInt(stringTokenizer.nextToken())>0) {
                    ans++;
                }
                else {
                    ans--;
                }
            }
            System.out.println("Case "+(cases++) + ": "+ans);
        }
    }
}
