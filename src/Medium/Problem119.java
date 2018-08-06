package Medium;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Ramin Tagizade
 * on Aug 06 , 2018
 * 9:32 PM
 */

public class Problem119 {

    public void solve() throws Exception{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String line = null;
        int cnt = 0;
        while ((line=bufferedReader.readLine())!=null) {
            if(line==null || line.isEmpty()) break;
            cnt++;
            int n = Integer.parseInt(line);
            String [] people = bufferedReader.readLine().split(" ");
            Map<String,Integer> map = new HashMap<>();
            for(int i=0;i<people.length;i++) {
                map.put(people[i],0);
            }
            for(int i=0;i<n;i++){
                String [] lines = bufferedReader.readLine().split(" ");
                String name = lines[0];
                int give = Integer.parseInt(lines[1]);
                int t = Integer.parseInt(lines[2]);
                if(t!=0) {
                    int avg = give / t;
                    int left = give - avg * t;
                    map.put(name, map.get(name) - avg*t);
                    for (int j = 1; j <= t; j++) {
                        String other = lines[j + 2];
                        map.put(other, map.get(other) + avg);
                    }
                }
            }
            if(cnt>1)
                System.out.println();
            for(int i=0;i<people.length;i++) {
                System.out.println(people[i] + " " + map.get(people[i]));
            }

        }
    }

    public static void main(String [] args ) throws Exception{

        Problem119 problem119 = new Problem119();
        problem119.solve();

    }
}
