package sorter;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ReadFile {
	
	public void Run(){
		
		try{
		
		FileReader fr = new FileReader(filename);
		BufferedReader br = new BufferedReader(fr);
		ArrayList<String> al = new ArrayList<String>();
		//ArrayList<Integer> al = new ArrayList<Integer>();
		String line = br.readLine();
		while (line != null){
			//al.add(Integer.parseInt(line));
			al.add(line);
			line = br.readLine();
			
		}
		
	    br.close();
	    return al;
	    
			
			

		}
		
		catch (Exception e) {
		       e.printStackTrace();
		}
	
	}
	

		
	}


