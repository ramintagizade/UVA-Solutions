package EasyProblems;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by Ramin Tagizade
 * on Jul 31 , 2018
 * 7:30 PM
 */
public class Problem11942 {

    public void solve() throws Exception{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String line = null;

        while((line=bufferedReader.readLine())!=null) {

            if(line==null || line.isEmpty()) break;

            int t = Integer.parseInt(line);
            for(int tt=0;tt<t;tt++) {
                String [] jacks = bufferedReader.readLine().split(" ");

                boolean increase = false;
                boolean decrease = false;
                boolean ordered = true;

                for(int i=0;i<jacks.length-1;i++){
                    int leftJack = Integer.parseInt(jacks[i]);
                    int rightJack = Integer.parseInt(jacks[i+1]);

                    if(leftJack <= rightJack && !decrease){
                        increase = true;
                    }
                    else if(leftJack >= rightJack && !increase) {
                        decrease = true;
                    }
                    else {
                        ordered = false;
                        break;
                    }

                }
                if(tt==0) {
                    System.out.println("Lumberjacks:");
                }
                if(ordered) {
                    System.out.println("Ordered");
                }
                else {
                    System.out.println("Unordered");
                }
            }

        }

    }

    public static void main(String [] args ) throws Exception{

        Problem11942 problem11942 = new Problem11942();
        problem11942.solve();
    }
}
