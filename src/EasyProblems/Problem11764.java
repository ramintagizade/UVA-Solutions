package EasyProblems;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by Ramin Tagizade
 * on Jul 31 , 2018
 * 7:10 PM
 */
public class Problem11764 {

    public void solve() throws Exception{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String line = null;

        int cases = 0;
        while((line=bufferedReader.readLine())!=null) {
            if(line==null || line.isEmpty()) break;
            int t = Integer.parseInt(line);
            for(int tt=0;tt<t;tt++) {

                int n = Integer.parseInt(bufferedReader.readLine());
                String [] tower = bufferedReader.readLine().split(" ");
                int high = 0;
                int low = 0;
                for(int i=0;i<n-1;i++) {
                    int jumpLeft = Integer.parseInt(tower[i]);
                    int jumpRight = Integer.parseInt(tower[i+1]);
                    if(jumpLeft < jumpRight) {
                        high++;
                    }
                    else if(jumpLeft > jumpRight ) {
                        low++;
                    }
                    else continue;
                }

                System.out.println("Case "+(tt+1)+": " + high + " "+ low);
            }
        }
    }

    public static void main (String [] args ) throws Exception{

        Problem11764 problem11764 = new Problem11764();
        problem11764.solve();
    }
}
