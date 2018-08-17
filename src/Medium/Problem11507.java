package Medium;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by Ramin Tagizade
 * on Aug 17 , 2018
 * 7:50 PM
 */

public class Problem11507 {

    public void solve() throws Exception{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String line = null;

        while((line=bufferedReader.readLine())!=null) {
            int L = Integer.parseInt(line);
            if(L==0) break;

            String [] dirs = bufferedReader.readLine().split(" ");
            String last_dir = "+x";
            String zStr = "+z -z";
            String yStr = "+y -y";
            boolean first = false;
            for(int i=0;i<dirs.length;i++) {
                if(!first && !dirs[i].equals("No")) {
                    last_dir = dirs[i];
                    first = true;
                }
                else if(dirs[i].equals("+z") ) {
                    if(last_dir.equals("+z")) {
                        last_dir = "-x";
                    }
                    else if(last_dir.equals("-z")) {
                        last_dir = "+x";
                    }
                    else if(last_dir.equals("+x")){
                        last_dir = "+z";
                    }
                    else if(last_dir.equals("-x")){
                        last_dir = "-z";
                    }
                    else if(last_dir.equals("+y")) {
                        last_dir = "+y";
                    }
                    else if(last_dir.equals("-y")){
                        last_dir = "-y";
                    }
                }
                else if(dirs[i].equals("-z")) {
                    if(last_dir.equals("+z")) {
                        last_dir = "+x";
                    }
                    else if(last_dir.equals("-z")){
                        last_dir = "-x";
                    }
                    else if(last_dir.equals("+x")){
                        last_dir = "-z";
                    }
                    else if(last_dir.equals("-x")){
                        last_dir = "+z";
                    }
                    else if(last_dir.equals("+y")) {
                        last_dir = "+y";
                    }
                    else if(last_dir.equals("-y")){
                        last_dir = "-y";
                    }
                }
                else if(dirs[i].equals("+y")){
                    if(last_dir.equals("+y") ) {
                        last_dir = "-x";
                    }
                    else if(last_dir.equals("-y")) {
                        last_dir = "+x";
                    }
                    else if(last_dir.equals("+x")){
                        last_dir = "+y";
                    }
                    else if(last_dir.equals("-x")){
                        last_dir = "-y";
                    }
                    else if(last_dir.equals("+z")) {
                        last_dir = "+z";
                    }
                    else if(last_dir.equals("-z")){
                        last_dir = "-z";
                    }
                }
                else if(dirs[i].equals("-y")){
                    if(last_dir.equals("+y")) {
                        last_dir = "+x";
                    }
                    else if(last_dir.equals("-y")){
                        last_dir = "-x";
                    }
                    else if(last_dir.equals("+x")){
                        last_dir = "-y";
                    }
                    else if(last_dir.equals("-x")){
                        last_dir = "+y";
                    }
                    else if(last_dir.equals("+z")) {
                        last_dir = "+z";
                    }
                    else if(last_dir.equals("-z")){
                        last_dir = "-z";
                    }
                }
            }

            System.out.println(last_dir);
        }
    }

    public static void main (String [] args ) throws Exception{
        Problem11507 problem11507 = new Problem11507();
        problem11507.solve();
    }
}
