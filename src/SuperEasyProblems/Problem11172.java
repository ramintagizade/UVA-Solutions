import java.util.Scanner;

/**
 * Problem link :
 * @see <a href="https://uva.onlinejudge.org/index.php?option=com_onlinejudge&Itemid=8&category=23&page=show_problem&problem=2113"></a>
 */


public class Problem11172 {

    public String compareTo(int a , int b ) {
        if(a == b ) return "=";
        else if(a > b) return ">";
        else return "<";
    }
    public static void main(String [] args ) {
        Scanner scanner = new Scanner(System.in);

        Problem11172 problem11172 = new Problem11172();

        int t = scanner.nextInt();

        for(int i=0;i<t;i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();

            System.out.println(problem11172.compareTo(x,y));
        }
    }
}
