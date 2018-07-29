package EasyProblems;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by Ramin Tagizade
 * on Jul 29 , 2018
 * 12:26 PM
 */
public class Problem11332 {

    public int G (int n) {

        if(n>9) {
            return G(sumOfDigits(n));
        }
        return n;
    }

    public int sumOfDigits(int n ) {
        int sum = 0;
        while(n>0) {
            sum+=n%10;
            n=n/10;
        }
        return sum;
    }

    public void process() throws Exception{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String line = null;

        while((line=bufferedReader.readLine())!=null) {
            int n = Integer.parseInt(line);
            if(n==0) break;
            System.out.println(G(n));
        }
    }

    public static void main (String [] args ) throws Exception {

        Problem11332 problem11332 = new Problem11332();
        problem11332.process();

    }
}
