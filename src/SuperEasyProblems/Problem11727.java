import java.util.Arrays;
import java.util.Scanner;

/**
 * Problem link :
 * @see <a href="https://uva.onlinejudge.org/index.php?option=com_onlinejudge&Itemid=8&category=117&page=show_problem&problem=2827"></a>
 */


public class Problem11727 {

    public static void main (String [] args ) {

        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();


        for(int i=0;i<t;i++) {
            int [] a = new int [3];
            for(int j=0;j<3;j++) {
                a[j] = scanner.nextInt();

            }
            Arrays.sort(a);
            System.out.println("Case "+(i+1) + ": "+a[1]);
        }

    }
}
