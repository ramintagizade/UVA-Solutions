package EasyProblems;

import java.io.*;

public class Problem12554 {

	public void  solve() throws Exception {
		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
		String line = null;

		while((line=buffer.readLine())!=null) {

			if(line==null || line.isEmpty()) break;

			int n = Integer.parseInt(line);
			String [] people = new String[n];
			String song = "Happy birthday to you Happy birthday to you Happy birthday to Rujia Happy birthday to you";
			String [] words = song.split(" ");
			for(int i=0;i<n;i++){
				people[i] = buffer.readLine();
			}
			int nextWord = 0;
			int i = 0;
			boolean hasFinished = false;
			int full = n/words.length;
			int repeatTimes = n - full*words.length > 0 ? full+1 : full;

			while(repeatTimes>0) {

				System.out.println(people[i]+": "+words[nextWord]);
				if(i<n-1){
					i++;
				}
				else {
					i = 0;
				}
				if(nextWord<words.length-1){
					nextWord++;
				}
				else {
					repeatTimes--;
					nextWord = 0;
				}
			}

			
		}
	}

	public static void main (String [] args ) throws Exception {

		Problem12554 problem12554 = new Problem12554();
		problem12554.solve();
	} 
}