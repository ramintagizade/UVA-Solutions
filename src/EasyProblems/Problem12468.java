package EasyProblems;

import java.io.*;

public class Problem12468 {

	public void  solve() throws Exception {
		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
		String line = null;

		while((line=buffer.readLine())!=null) {

			String [] lines = line.split(" ");
			int a = Integer.parseInt(lines[0]);
			int b = Integer.parseInt(lines[1]);

			if(a > b) {
				int temp = b;
				b = a;
				a = temp;
			}

			if(a==-1 && b==-1) break;

			int turn1 = Math.abs(a-b);
			int turn2 = a + (99-b) + 1;
			
			int minTurns = turn1>=turn2 ? turn2 : turn1;
			System.out.println(minTurns);
		}
	}

	public static void main (String [] args ) throws Exception {

		Problem12468 problem12468 = new Problem12468();
		problem12468.solve();
	} 
}