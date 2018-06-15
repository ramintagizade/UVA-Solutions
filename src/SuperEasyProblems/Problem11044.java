import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Problem link :
 * @see <a href="https://uva.onlinejudge.org/index.php?option=com_onlinejudge&Itemid=8&category=22&page=show_problem&problem=1985"></a>
 */

public class Problem11044 {

    public  static void main (String [] args ) {

        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        for(int i=0;i<t;i++) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();

            System.out.println((n/3) * (m/3));
        }

    }
}
