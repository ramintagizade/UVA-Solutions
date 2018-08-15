package Medium;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Ramin Tagizade
 * on Aug 15 , 2018
 * 6:57 PM
 */

public class Problem10919 {

    public void solve() throws Exception{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String line = null;

        while((line=bufferedReader.readLine())!=null) {
            if(line.equals("0") || line.isEmpty()) break;
            String [] params = line.split(" ");
            int n = Integer.parseInt(params[0]);
            int k = Integer.parseInt(params[1]);

            String [] items = bufferedReader.readLine().split(" ");
            Map<String,Boolean> mapCourses = new HashMap<>();
            for(int i=0;i<n;i++) {
                mapCourses.put(items[i],true);
            }
            boolean ok = true;
            for(int i=0;i<k;i++) {
                String [] opts = bufferedReader.readLine().split(" ");
                int nc = Integer.parseInt(opts[0]);
                int nr = Integer.parseInt(opts[1]);
                int cnt = 0;
                for(int j=0;j<nc;j++) {
                    if(mapCourses.get(opts[j+2])!=null && mapCourses.get(opts[j+2])){
                        cnt++;
                    }
                }
                if(nr>cnt){
                    ok = false;
                }
            }
            if(!ok){
                System.out.println("no");
            }
            else {
                System.out.println("yes");
            }
        }
    }

    public static void main(String [] args ) throws Exception{
        Problem10919 problem10919 = new Problem10919();
        problem10919.solve();
    }
}
