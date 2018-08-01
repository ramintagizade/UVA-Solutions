package EasyProblems;

import java.util.*;
import java.io.*;

/**
 * Created by Ramin Tagizade
 * on Aug 01 , 2018
 * 10:15 PM
 */

public class Problem12015 {

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

	public void solve () throws Exception {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		String line = null;

		while((line=bufferedReader.readLine())!=null){
			if(line==null || line.isEmpty()) break;

			int t = Integer.parseInt(line);

			for(int tt = 0; tt<t; tt++) {
				List<Pair<String,Integer>> list = new ArrayList<>();
				int maxFreq = 0;
				for(int i=0;i<10;i++){
					String [] lines = bufferedReader.readLine().split(" ");
					String url = lines[0];
					int relevance = Integer.parseInt(lines[1]);
					list.add(new Pair(url,relevance));
					if(maxFreq < relevance) maxFreq = relevance;
 				}

 				System.out.println("Case #"+(tt+1)+":");
 				for(Pair<String,Integer> pair : list) {
 					if(pair.second==maxFreq){
 					   System.out.println(pair.first);
 					}
 				}
			}
		}
	}

	public static void main(String [] args ) throws Exception {

		Problem12015 problem12015 = new Problem12015();
		problem12015.solve();

	}
}