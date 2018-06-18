package SuperEasyProblems;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Problem link :
 * @see <a href="https://uva.onlinejudge.org/index.php?option=com_onlinejudge&Itemid=8&category=278&page=show_problem&problem=3794"></a>
 */

public class Problem12372 {

    public static void main(String [] args ) {

        Scanner scanner = new Scanner(System.in);

        int t = Integer.parseInt(scanner.nextLine());
        int cases = 1;
        for(int i=0;i<t;i++) {
            String [] a = scanner.nextLine().split(" ");

            int l = Integer.parseInt(a[0]);
            int w = Integer.parseInt(a[1]);
            int h = Integer.parseInt(a[2]);

            if(l >20 || w >20 || h > 20) System.out.println("Case "+ cases + ": bad");
            else System.out.println("Case "+ cases + ": good");
            cases++;
        }
    }
}
