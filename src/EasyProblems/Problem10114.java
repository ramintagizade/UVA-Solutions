package EasyProblems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Problem link :
 * @see <a href="https://uva.onlinejudge.org/index.php?option=com_onlinejudge&Itemid=8&page=show_problem&problem=1055"></a>
 */



public class Problem10114 {

    public static void main (String [] args ) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String line = null;

        while((line=bufferedReader.readLine())!=null && Double.parseDouble(line.split(" ")[0])>0) {
            String [] a = line.split(" ");
            int months = Integer.parseInt(a[0]);
            double initPayment = Double.parseDouble(a[1]);
            double price = Double.parseDouble(a[2]);
            int deps = Integer.parseInt(a[3]);

            double leftPrice = price;
            int [] whichMonths = new int[deps];
            double [] depPercts = new double[deps];


            for(int i=0;i<deps;i++) {
                line = bufferedReader.readLine();
                a = line.split(" ");
                whichMonths[i] = Integer.parseInt(a[0]);
                depPercts[i] = Double.parseDouble(a[1]);
            }

            double payment = leftPrice/months;
            double lastPercent = depPercts[0];
            double curValue = (price + initPayment)*(1-lastPercent);

            int i = 1;
            int cnt = 1;
            while(leftPrice >= curValue) {
                if(cnt <deps && whichMonths[cnt]==i) {
                    lastPercent = depPercts[cnt];
                    cnt++;
                }
                leftPrice-=payment;
                curValue=curValue *(1-lastPercent);
                i++;
            }
            i--;
            if(i==1) System.out.println((i)+" month");
            else
                System.out.println((i) + " months");
        }
    }
}
