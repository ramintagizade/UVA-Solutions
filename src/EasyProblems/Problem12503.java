package EasyProblems;

import java.io.*;

public class Problem12503 {

	public void  solve() throws Exception {
		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
		String line = null;

		while((line=buffer.readLine())!=null) {

			if(line==null || line.isEmpty()) break;

			int t = Integer.parseInt(line);
			for(int tt=0;tt<t;tt++) {
				int n = Integer.parseInt(buffer.readLine());
				int [] instructions = new int[n];
				int position = 0;
				for(int i=0;i<n;i++) {
					String ins = buffer.readLine();
					if(ins.contains("SAME")) {
						int idx = Integer.parseInt(ins.split(" ")[2]);
						instructions[i]=instructions[idx-1];
						position+=instructions[idx-1];	
					}
					else if(ins.equals("LEFT")) {
						instructions[i]=-1;
						position-=1;
					}
					else if(ins.equals("RIGHT")){
						instructions[i]=1;
						position+=1;
					}
				}
				System.out.println(position);
			}
		}
	}

	public static void main (String [] args ) throws Exception {

		Problem12503 problem12503 = new Problem12503();
		problem12503.solve();
	} 
}