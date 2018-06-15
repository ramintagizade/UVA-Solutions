import java.util.Scanner;

/**
 * Problem link :
 * @see <a href="https://uva.onlinejudge.org/index.php?option=com_onlinejudge&Itemid=8&category=244&page=show_problem&problem=3710"></a>
 */



public class Problem12289 {

    public static void main (String [] args ) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        for(int i=0;i<n;i++) {
            String line = scanner.next();
            if(line.length()==5) {
                System.out.println(3);
            }
            else if( (line.contains("e") && line.contains("n")) || (line.contains("e") && line.contains("o")) || (line.contains("o") && line.contains("n"))) {
                System.out.println(1);
            }
            else
                System.out.println(2);
        }
    }
}
