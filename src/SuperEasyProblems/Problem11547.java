package SuperEasyProblems;

import java.util.Scanner;

/**
 * Problem link :
 * @see <a href="https://uva.onlinejudge.org/index.php?option=com_onlinejudge&Itemid=8&category=27&page=show_problem&problem=2542"></a>
 */

public class Problem11547 {
    public static void main (String [] args) {

        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for(int i=0;i<t;i++) {
            int n = scanner.nextInt();
            int ans = (n*63 + 7492)*5-498;
            System.out.println(Math.abs(ans%100)/10);
        }
    }
}
