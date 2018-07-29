package EasyProblems;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by Ramin Tagizade
 * on Jul 29 , 2018
 * 12:42 PM
 */
public class Problem11559 {

    public void solve ()  throws  Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String line = null;

        while((line=bufferedReader.readLine())!=null) {

            if (line==null || line.isEmpty()) break;

            String [] eventDetails = line.split(" ");
            int n = Integer.parseInt(eventDetails[0]);
            int b = Integer.parseInt(eventDetails[1]);
            int h = Integer.parseInt(eventDetails[2]);
            int w = Integer.parseInt(eventDetails[3]);

            double avg_price = (double)b/n;
            int min_cost = 900000000;
            boolean check = false;

            for(int i=0;i<h;i++) {
                int price = Integer.parseInt(bufferedReader.readLine());
                String []  seats_week = bufferedReader.readLine().split(" ");
                for(int j=0;j<seats_week.length;j++) {
                    int seats = Integer.parseInt(seats_week[j]);
                    int current_cost = n*price;
                    if(price<=avg_price && seats>=n && min_cost>current_cost){
                        check = true;
                        min_cost = current_cost;
                    }
                }
            }

            if(!check) System.out.println("stay home");
            else System.out.println(min_cost);
        }

    }


    public static void main(String [] args ) throws Exception{

        Problem11559 problem11559 = new Problem11559();
        problem11559.solve();
    }
}
