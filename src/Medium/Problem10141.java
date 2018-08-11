//package Medium;

import java.util.*;
import java.io.*;
/**
 * Created by Ramin Tagizade
 * on Aug 10 , 2018
 * 9:51 PM
 */

public class Problem10141 {

    private class Pair <K,V> {
		private K first;
		private V second;

		public Pair(K first, V second ) {
			this.first = first;
			this.second = second;
		}
		public K getFirst() {
			return first;
		}

		public void setFirst(K first) {
			this.first = first;
		}

		public V getSecond() {
			return second;
		}

		public void setSecond(V second) {
			this.second = second;
		}
	}

    public void solve() throws Exception{

        BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in));
        String line = null;

        int cases = 0;
        while((line=scanner.readLine())!=null) {
        	cases++;
            String [] params = line.split(" ");
            int n = Integer.parseInt(params[0]);
            int p = Integer.parseInt(params[1]);

            if(n==0 && p==0) break;

            for(int i=0;i<n;i++) {
                String r = scanner.readLine();
                // just readline
            }

            double rfp = 0;
            double maxRFP = 0;
            String option = "";
            double minPrice = 1e9;
            Map<Double,List<Pair<String,Double>>> mapRFP = new HashMap<>();

            for(int i=0;i<p;i++) {

                String rr = scanner.readLine();
                params = scanner.readLine().split(" ");
                double price = Double.parseDouble(params[0]);
                int props = Integer.parseInt(params[1]);

                int cnt = 0;
                for(int j=0;j<props;j++) {
                    String pp = scanner.readLine();
                    // just readline
                }

                rfp = (double)props/(double)n; 

                if(maxRFP < rfp) maxRFP = rfp;
                List<Pair<String,Double>> list = mapRFP.get(rfp);
                Pair<String,Double> pair = new Pair<>(rr,price);
                if(list!=null) {
                    list.add(pair);
                }
                else {
                    list = new ArrayList<>();
                    list.add(pair);
                }
                mapRFP.put(rfp,list);
               
            }
            List<Pair<String,Double>> list = mapRFP.get(maxRFP);
            for(int i=0;i<list.size();i++) {
            	Pair<String,Double> pair = list.get(i);
            	if(minPrice>pair.getSecond()) {
            		minPrice = pair.getSecond();
            		option = pair.getFirst();
            	}
            }
            
            if(cases>1)
            	System.out.println();

            System.out.println("RFP #"+cases);
            System.out.println(option);
        }
    }

    public static void main (String [] args ) throws Exception {
    	Problem10141 problem10141 = new Problem10141();
    	problem10141.solve();
    }
}


