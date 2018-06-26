package EasyProblems;

/**
 * Created by Ramin Tagizade
 * on Jun 26 , 2018
 * 3:47 PM
 */


import java.util.Scanner;

/**
 * Problem link :
 * @see <a href="https://uva.onlinejudge.org/index.php?option=com_onlinejudge&Itemid=8&category=15&page=show_problem&problem=1241"></a>
 */

public class Problem10300 {

    public static void main (String [] args ) {

        Scanner scanner = new Scanner(System.in);
        int t = Integer.parseInt(scanner.nextLine());

        for(int i=0;i<t;i++) {
            int tt = Integer.parseInt(scanner.nextLine());

            int ans = 0;
            for(int j=0;j<tt;j++) {
                String [] line = scanner.nextLine().split(" ");

                int s = Integer.parseInt(line[0]);
                int n = Integer.parseInt(line[1]);
                int f = Integer.parseInt(line[2]);

                double avg = (double)s/(double)n;
                ans+=(avg*avg)*f*n*(1/avg);
            }
            System.out.println(ans);
        }

    }
}
