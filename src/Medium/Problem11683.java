package Medium;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by Ramin Tagizade
 * on Aug 19 , 2018
 * 5:10 PM
 */
public class Problem11683 {

    public void solve() throws Exception{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String line = null;

        while((line=bufferedReader.readLine())!=null) {
            String [] params = line.split(" ");
            int A = Integer.parseInt(params[0]);
            if(A==0) break;
            int L = Integer.parseInt(params[1]);


            String [] c = bufferedReader.readLine().split(" ");

            int times = 0;
            int cl = A;
            for(int i =0;i<c.length;i++) {
                int cr = Integer.parseInt(c[i]);
                if(cl> cr) {
                    times+=cl-cr;
                }
                cl = cr;
            }
            System.out.println(times);
        }
    }

    public static void main(String [] args ) throws Exception{

        Problem11683 problem11683 = new Problem11683();
        problem11683.solve();
    }
}
