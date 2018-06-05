import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Problem link :
 * @see <a href="https://uva.onlinejudge.org/index.php?option=com_onlinejudge&Itemid=8&category=17&page=show_problem&problem=1491"></a>
 */


public class Problem10550 {

    public static void main (String [] args ) throws IOException {

        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String line = null;

        while( (line=bufferedReader.readLine())!=null) {
            String[] nums = line.split(" ");
            int a = Integer.parseInt(nums[0]);
            int b = Integer.parseInt(nums[1]);
            int c = Integer.parseInt(nums[2]);
            int d = Integer.parseInt(nums[3]);

            int deg = 1080 + ((a-b+40)%40)*9 + ((c-b+40)%40)*9 + ((c-d+40)%40)*9;

            if(a == 0 && b == 0 && c ==0 && d == 0) break;
            System.out.println(deg);
        }
    }
}
