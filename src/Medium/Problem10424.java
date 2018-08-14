package Medium;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Ramin Tagizade
 * on Aug 14 , 2018
 * 9:21 PM
 */

public class Problem10424 {

    public void solve() throws Exception{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String line = null;

        while((line=bufferedReader.readLine())!=null) {

            if(line==null || line.isEmpty()) break;

            String inp1= line;
            String inp2 = bufferedReader.readLine();

            int  acc1 = calculateAccuracy(inp1);
            int  acc2 = calculateAccuracy(inp2);

            acc1 = isOkay(acc1);
            acc2 = isOkay(acc2);

            if(acc1>acc2 ) {
                int temp  = acc1;
                acc1 = acc2;
                acc2 = temp;
            }
            double value = (double) acc1 / (double) acc2;
            System.out.printf("%.2f",value*100).println(" %");
        }
    }

    public int  calculateAccuracy(String str) {

        str = str.toLowerCase();
        Map<Character,Integer> map = new HashMap<>();
        int j = 0;
        for(char i='a';j<26;i++,j++) {
            map.put(i,j+1);
        }
        int accuracy = 0;
        for(int i=0;i<str.length();i++) {
            char ch = str.charAt(i);
            if(Character.isAlphabetic(ch)) {
                accuracy+=map.get(ch);
            }
        }
        return accuracy;
    }

    public int isOkay(int n ) {
        if(n<=9) return n;
        int sum = 0;
        while (n!=0) {
            sum+=n%10;
            n=n/10;
        }
        return isOkay(sum);
    }

    public static void main (String [] args ) throws Exception {
        Problem10424 problem10424 = new Problem10424();
        problem10424.solve();
    }
}
