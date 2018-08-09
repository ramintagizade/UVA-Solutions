package Medium;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by Ramin Tagizade
 * on Aug 09 , 2018
 * 9:20 PM
 */

public class Problem661 {

    public void solve() {
        Scanner scanner = new Scanner(System.in);
        int cases = 0;
        while (scanner.hasNext()) {
            cases++;
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            int c = scanner.nextInt();

            if(n==0 && m==0 && c==0) break;

            int [] consume = new int [n];
            for(int i=0;i<n;i++) {
                consume[i] = scanner.nextInt();
            }

            Map<Integer,Boolean> turned = new HashMap<>();
            int currentConsume = 0;
            int maxConsume = 0;
            for(int i=0;i<n;i++) {
                turned.put(i,false);
            }
            for(int i=0;i<m;i++) {
                int id = scanner.nextInt();

                if(turned.get(id-1)) {
                    // off
                    currentConsume-=consume[id-1];
                    turned.put(id-1,false);
                }
                else {
                    //on
                    turned.put(id-1,true);
                    currentConsume+=consume[id-1];
                    if(maxConsume<currentConsume) maxConsume = currentConsume;
                }
            }

            if(maxConsume>c){
                System.out.println("Sequence " + cases);
                System.out.println("Fuse was blown.");
            }
            else {
                System.out.println("Sequence "+cases);
                System.out.println("Fuse was not blown.");
                System.out.println("Maximal power consumption was "+ maxConsume+ " amperes.");
            }
            System.out.println();
        }
    }

    public static void main (String [] args ) {
        Problem661 problem661 = new Problem661();
        problem661.solve();
    }
}
