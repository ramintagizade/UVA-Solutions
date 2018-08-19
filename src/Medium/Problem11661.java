package Medium;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by Ramin Tagizade
 * on Aug 19 , 2018
 * 4:21 PM
 */
public class Problem11661 {

    public void solve() throws Exception{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String line = null;

        while((line=bufferedReader.readLine())!=null) {
            int L = Integer.parseInt(line);

            if(L==0) break;

            String seq = bufferedReader.readLine();

            int minDist = (int)1e9;
            if(seq.contains("Z")) System.out.println(0);
            else {
                int rPos = -1;
                int dPos = -1;
                for(int i=0;i<seq.length();i++) {
                    if(seq.charAt(i)=='R'){
                        rPos = i;
                    }
                    else if(seq.charAt(i)=='D'){
                        dPos = i;
                    }
                    int dist = Math.abs(dPos-rPos);
                    if(rPos!=-1 && dPos!=-1 && (dist < minDist )) {
                        minDist = dist;
                    }
                }
                System.out.println(minDist);
            }
        }
    }

    public static void main(String [] args ) throws Exception{
        Problem11661 problem11661 = new Problem11661();
        problem11661.solve();
    }
}
