package EasyProblems;

/**
 * Created by Ramin Tagizade
 * on Jun 26 , 2018
 * 4:28 PM
 */

import java.util.HashSet;
import java.util.Scanner;

/**
 * Problem link :
 * @see <a href="https://uva.onlinejudge.org/index.php?option=com_onlinejudge&Itemid=8&category=21&page=show_problem&problem=1904"></a>
 */


public class Problem10963 {

    public static void  main (String [] args  ) {

        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        for(int i=0;i<t;i++) {

            int n = scanner.nextInt();

            HashSet<Integer> set = new HashSet<>();
            boolean ok = true;

            for(int j=0;j<n;j++) {
                int y1 = scanner.nextInt();
                int y2 = scanner.nextInt();

                int gap = Math.abs(y1 - y2);
                set.add(gap);
            }
            if(i!=0) System.out.println();
            if(set.size()!=1) {
                System.out.println("no");
            }
            else System.out.println("yes");
        }
    }
}
