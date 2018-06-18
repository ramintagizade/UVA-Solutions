package EasyProblems;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Problem link :
 * @see <a href="https://uva.onlinejudge.org/index.php?option=com_onlinejudge&Itemid=8&category=8&page=show_problem&problem=562"></a>
 */

public class Problem621 {

    public static void main (String [] args ) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine());

        for(int i=0;i<n;i++) {

            String number = bufferedReader.readLine();
            int len = number.length();

            if(number.equals("1") || number.equals("4") || number.equals("78")) {
                System.out.println("+");
            }
            else if(len > 2 && number.endsWith("35")) {
                System.out.println("-");
            }
            else if(number.startsWith("9") && number.endsWith("4") && len > 2) {
                System.out.println("*");
            }
            else if(number.startsWith("190") && len > 3){
                System.out.println("?");
            }
            else {
                System.out.println("+");
            }
        }
    }
}
