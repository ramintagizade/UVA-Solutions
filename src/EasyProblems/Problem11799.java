package EasyProblems;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by Ramin Tagizade
 * on Jul 31 , 2018
 * 7:22 PM
 */
public class Problem11799 {

    public void solve() throws Exception{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String line = null;

        while((line=bufferedReader.readLine())!=null) {
            if(line==null || line.isEmpty()) break;
            int n = Integer.parseInt(line);
            for(int i=0;i<n;i++) {
                int max = 0;
                String [] values = bufferedReader.readLine().split(" ");
                for(int j=0;j<values.length;j++) {
                    int value = Integer.parseInt(values[j]);
                    if(value > max) max = value;
                }
                System.out.println("Case "+(i+1)+": "+max);
            }
        }
    }

    public static void main (String [] args) throws Exception{

        Problem11799 problem11799 = new Problem11799();
        problem11799.solve();
    }
}
