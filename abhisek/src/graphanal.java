

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class graphanal {

	public static void main(String[] arg)
	{
		String[] st = new String[105];
		int[][] g=new int[105][105];
		int m=0;
		File f=new File("pol.txt");
		
		try {int n=0;
			Scanner s=new Scanner(f);
			while(n<105)
			{
				String t=s.next();
				while(!t.equals("value")){ t=s.next();}	
				st[n++]=s.next().substring(1, 2);
					//System.out.print("\n"+st[n-1]);
						
			}
			 n=0;
			
			//st=st.concat("<!-- edges -->\n");
			while(n++<=440)
			{
				s.next();s.next();s.next(); s.next();
				int a=Integer.parseInt(s.next());s.next();
				//st=st.concat("<edge source=\""+a+"\" target=\"");
				int b=Integer.parseInt(s.next());
				//st=st.concat(b+"\"></edge>\n");
				if(st[a].equals(st[b])){m++;}
				g[a][b]=1;
				g[b][a]=1;
				
			}
			//st=st.concat("</graph>\n</graphml>");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//System.out.print(""+g[104][103]+" "+m);
		
		
		
	}
	
	
}
