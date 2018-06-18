package SuperEasyProblems;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * Problem link :
 * @see <a href="https://uva.onlinejudge.org/index.php?option=com_onlinejudge&Itemid=8&category=279&page=show_problem&problem=3834"></a>
 */

public class Problem12403 {

    public static void main (String [] args) {

        Scanner scanner = new Scanner(System.in);
        int t = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        for(int i=0;i<t;i++) {
            String line = scanner.nextLine();
            if(line.contains("report")) {
                System.out.println(sum);
            }
            else {
                String [] a = line.split(" ");
                sum+=Integer.parseInt(a[1]);
            }
        }
    }
}
