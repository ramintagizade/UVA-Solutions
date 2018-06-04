import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Problem link :
 * @see <a href="https://uva.onlinejudge.org/index.php?option=com_onlinejudge&Itemid=8&page=show_problem&problem=208"></a>
 */

public class Problem272 {

    public void solve (BufferedReader bufferedReader) throws IOException {
        String line = null;
        boolean first = true;
        boolean second = false;
        while( (line = bufferedReader.readLine()) !=null) {
            StringBuilder str = new StringBuilder("");

            for(int i=0;i<line.length();i++) {
                if(first && line.charAt(i) == '"') {
                    first = false;
                    second = true;
                    str.append("``");
                }
                else if(second && line.charAt(i) == '"') {
                    second = false;
                    first = true;
                    str.append("''");
                }
                else {
                    str.append(line.charAt(i));
                }
            }
            System.out.println(str);
        }


    }
    public static void main (String [] args ) throws IOException {


        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        Problem272 problem272 = new Problem272();
        problem272.solve(bufferedReader);

    }
}
