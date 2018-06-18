package SuperEasyProblems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Problem link :
 * @see <a href="https://uva.onlinejudge.org/index.php?option=com_onlinejudge&Itemid=8&category=244&page=show_problem&problem=3402"></a>
 */

public class Problem12250 {

    public static void main(String [] args ) throws IOException {

        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String line = null;
        int cnt = 1;
        while((line=bufferedReader.readLine())!=null) {
            if(line.equals("#")) break;
            switch (line) {
                case "HELLO" :
                    System.out.println("Case "+cnt+": " + "ENGLISH");
                    break;
                case "HOLA" :
                    System.out.println("Case "+cnt+": " + "SPANISH");
                    break;
                case "HALLO" :
                    System.out.println("Case "+cnt+": " + "GERMAN");
                    break;
                case "BONJOUR":
                    System.out.println("Case "+cnt+": " + "FRENCH");
                    break;
                case "CIAO" :
                    System.out.println("Case "+cnt+": " + "ITALIAN");
                    break;
                case "ZDRAVSTVUJTE" :
                    System.out.println("Case "+cnt+": " + "RUSSIAN");
                    break;
                    default:
                        System.out.println("Case "+cnt+": " + "UNKNOWN");
                        break;

            }
            cnt++;
        }
    }
}
