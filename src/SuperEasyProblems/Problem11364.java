import java.util.Arrays;
import java.util.Scanner;

/**
 * Problem link :
 * @see <a href="https://uva.onlinejudge.org/index.php?option=com_onlinejudge&Itemid=8&page=show_problem&problem=2349"></a>
 */



public class Problem11364 {

    public static void main (String [] args ) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();
        for(int i=0;i<t;i++) {
            int n = scanner.nextInt();
            int [] a = new int [n];
            for(int j=0;j<n;j++) {
                a[j] = scanner.nextInt();
            }
            Arrays.sort(a);
            int dist = 0;
            for(int j=1;j<n;j++) {
                dist+=a[j]-a[j-1];
            }
            if(n==1) dist=0;
            dist=dist*2;
            System.out.println(dist);
        }
    }
}
