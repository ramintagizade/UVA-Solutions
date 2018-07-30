package EasyProblems;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * Created by Ramin Tagizade
 * on Jul 30 , 2018
 * 10:01 PM
 */
public class Problem11679 {

    public void simulateProcess() throws Exception{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String line = null;

        while((line=bufferedReader.readLine())!=null) {

            String [] line1 = line.split(" ");
            int b = Integer.parseInt(line1[0]);
            int n = Integer.parseInt(line1[1]);

            if(b==0 && n==0) break;

            String [] line2 = bufferedReader.readLine().split(" ");
            int [] r = new int[b];
            for(int i=0;i<b;i++) {
                r[i] = Integer.parseInt(line2[i]);
            }

            for(int i=0;i<n;i++) {
                String [] line3 = bufferedReader.readLine().split(" ");
                int d = Integer.parseInt(line3[0]);
                int c = Integer.parseInt(line3[1]);
                int debenture = Integer.parseInt(line3[2]);

                r[d-1]-=debenture;
                r[c-1]+=debenture;
            }
            int cnt = 0;
            for(int i=0;i<b;i++) {
                if(r[i]>=0) cnt++;
            }
            if(cnt==b) System.out.println("S");
            else System.out.println("N");
        }

    }


    public static void main (String [] args ) throws Exception{

        Problem11679 problem11679 = new Problem11679();
        problem11679.simulateProcess();
    }

}
