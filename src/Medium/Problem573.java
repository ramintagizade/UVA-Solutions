package Medium;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigDecimal;

/**
 * Created by Ramin Tagizade
 * on Aug 08 , 2018
 * 9:46 PM
 */
public class Problem573 {

   

    public void solve() throws Exception{
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        String line = null;

        while((line=buffer.readLine())!=null) {
            String [] params = line.split(" ");
            int h = Integer.parseInt(params[0]);

            if(h==0) break;


            int u = Integer.parseInt(params[1]);
            int d = Integer.parseInt(params[2]);
            int f = Integer.parseInt(params[3]);

            double factorLost = (double)u*(double)f*0.01;

            double curHeight = 0;
            double distanceClimbed = u;
            for(int i=1;i<=10000;i++) {
                curHeight+=distanceClimbed;
                if(curHeight>h){
                    System.out.println("success on day "+i);
                    break;
                }
                curHeight-=d;
                if(curHeight<0) {
                    System.out.println("failure on day "+i);
                    break;
                }
                distanceClimbed-=factorLost;
                if(distanceClimbed<0) distanceClimbed=0;

            }
        }

    }

    public static void main (String [] args ) throws Exception{

        Problem573 problem573 = new Problem573();
        problem573.solve();
    }
}
