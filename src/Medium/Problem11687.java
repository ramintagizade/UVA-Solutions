package Medium;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * Created by Ramin Tagizade
 * on Aug 20 , 2018
 * 10:31 PM
 */
public class Problem11687 {

    public void solve() throws Exception{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(System.out);

        String line = null;

        while((line=bufferedReader.readLine())!=null) {
            if(line.equals("END")) {
                break;
            }
            if(line.equals("1")) System.out.println(1);
            else {
                int cnt = 1;
                findDigCount(line, cnt);
            }
        }


    }
    private void findDigCount(String str,int cnt  ) {

        cnt++;

        int next = str.length();

        if(str.length()==Integer.toString(next).length()) {
            System.out.println(cnt);
        }
        else {
            findDigCount(Integer.toString(next),cnt);
        }
    }


    public static void main (String [] args ) throws Exception{
        Problem11687 problem11687 = new Problem11687();
        problem11687.solve();
    }
}
