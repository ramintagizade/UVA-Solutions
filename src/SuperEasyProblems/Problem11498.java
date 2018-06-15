import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem11498 {

    /**
     * Problem link :
     * @see <a href="https://uva.onlinejudge.org/index.php?option=com_onlinejudge&Itemid=8&category=26&page=show_problem&problem=2493"></a>
     */

    public static void main(String [] args ) throws IOException {

        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String line = null;
        boolean next = false;
        int n=-1, m = -1;
        while((line=bufferedReader.readLine())!=null) {
            String [] inps = line.split(" ");
            int k=-1,x=-1,y = -1;


            if(inps.length==1){
                k = Integer.parseInt(inps[0]);
                if(k==0) {
                    break;
                }
                next = true;
            }
            else if(next) {
                n = Integer.parseInt(inps[0]);
                m = Integer.parseInt(inps[1]);
                next = false;
            }
            else {
                x = Integer.parseInt(inps[0]);
                y = Integer.parseInt(inps[1]);

                if (n==x ||  m == y )
                    System.out.println("divisa");

                else if(n < x && m < y)
                    System.out.println("NE");

                else if(n>x && m<y)
                    System.out.println("NO");

                else if(n >x && m> y )
                    System.out.println("SO");

                else if(n<x && m>y) {
                    System.out.println("SE");
                }
            }



        }
    }
}
