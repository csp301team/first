package prefuse.demos;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import prefuse.data.io.AbstractGraphReader;
import prefuse.data.io.GraphReader;
import prefuse.data.Graph;
public class gmltry {

	/*
	Graph g = readGraph();

	private Graph readGraph() {
		// TODO Auto-generated method stub
		return null;
	}
	*/
	public static void main(String[] arg)
	{
		String st="<?xml version=+\"1.0\" encoding=\"UTF-8\"?>\n<!--  An excerpt of an egocentric social network  -->\n<graphml xmlns=\"http://graphml.graphdrawing.org/xmlns\">\n<graph edgedefault=\"undirected\">\n<key id=\"name\" for=\"node\" attr.name=\"name\" attr.type=\"string\"/>\n<key id=\"gender\" for=\"node\" attr.name=\"gender\" attr.type=\"string\"/>\n<!-- nodes -->\n";
		
		File f=new File("pol.txt");
		
		try {int n=0;
			Scanner s=new Scanner(f);
			while(n<105)
			{
				while(!s.next().equals("node")){}
					st=st.concat("<node id="+(n++)+">\n<data key=\"name\">");
					s.next();s.next();s.next();s.next();
					String t=s.next();
					while(!t.equals("value")){st=st.concat(" "+t+" "); t=s.next();}	
					
					st=st.concat("</data>\n<data key=\"gender\">"+s.next()+"</data>\n</node>\n");
					
			}
			n=0;
			
			st=st.concat("<!-- edges -->\n");
			while(n++<=440)
			{
				s.next();s.next();s.next();s.next();
				st=st.concat("<edge source=\""+s.next()+"\" target=\"");
				s.next();	st=st.concat(s.next()+"\"></edge>\n");
				
			}
			st=st.concat("</graph>\n</graphml>");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.print(st);
		
		
		
	}
	
}
