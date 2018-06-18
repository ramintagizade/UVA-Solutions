package SuperEasyProblems;

import java.util.Scanner;

/**
 *
 * Problem link :
 * @see <a href="https://uva.onlinejudge.org/index.php?option=com_onlinejudge&Itemid=8&category=441&page=show_problem&problem=4022"></a>
 */


public class Problem12577 {

    public static void main (String [] args) {

        Scanner scanner = new Scanner(System.in);

        int cases = 1;
        while(scanner.hasNextLine()) {
            String line = scanner.nextLine();

            if(line.contains("*")) break;

            if(line.contains("Hajj")) {
                System.out.println("Case "+ cases + ": Hajj-e-Akbar");
            }
            else {
                System.out.println("Case " +cases + ": Hajj-e-Asghar");
            }
            cases++;
        }
    }
}
