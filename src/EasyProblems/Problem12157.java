package EasyProblems;

import java.io.*;

public class Problem12157 {

	public void  solve() throws Exception {
		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
		String line = null;

		while((line=buffer.readLine())!=null) {
			if(line==null || line.isEmpty()) break;
			int t = Integer.parseInt(line);
			for(int tt=0;tt<t;tt++) {
				int n = Integer.parseInt(buffer.readLine());
				String [] calls = buffer.readLine().split(" ");
				int cost1 = 0;
				int cost2 = 0;
				for(int i=0;i<n;i++) {
					int callDuration = Integer.parseInt(calls[i]);
					cost1+=calculateTariff1(callDuration);
					cost2+=calculateTariff2(callDuration);
				}
				if(cost1 < cost2) {
					System.out.println("Case "+(tt+1)+": " + "Mile "+ cost1);
				}
				else if(cost1 > cost2 ) {
					System.out.println("Case "+(tt+1)+": " + "Juice "+ cost2);
				}
				else {
					System.out.println("Case "+(tt+1)+": " + "Mile Juice " + cost1);
				}
			}
		}
	}

	private int calculateTariff1(int seconds) {
		int cost = (seconds/30)*10 + 10;
		return cost;
	}

	private int calculateTariff2(int seconds ) {
		int cost = (seconds/60)*15 + 15;
		return cost;
	}

	public static void main (String [] args ) throws Exception {

		Problem12157 problem12157 = new Problem12157();
		problem12157.solve();
	} 
}