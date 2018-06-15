import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

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
        while((line=bufferedReader.readLine())!=null) {
            if(ok) {
                n = Integer.parseInt(line);
                ok = false;
                if(n==0) break;
            }
            else {
                String [] a = line.split(" ");
                int ans = 0;
                for(int i=0;i<a.length;i++) {
                    int b = Integer.parseInt(a[i]);
                    if(b!=0) ans+=1;
                    else ans-=1;
                }
                ok = true;
                System.out.println("Case "+cases + ": "+ans);
                cases++;
            }
        }
    }
}
