package sorter;

import java.io.BufferedWriter;
import java.io.File;
import java.io.PrintWriter;
import java.io.IOException;


public class GenerateFile {
	
	
	
	public static void main(String[] args) {
		try {

			GenerateString g = new GenerateString();
			String content = g.getStr(500000); //enter how many lines
			
			File file = new File("C:/Users/Ryan/Desktop/CS151/data.txt");

			// if file doesnt exists, then create it
			if (!file.exists()) {
				file.createNewFile();
			}

			PrintWriter pw = new PrintWriter(file.getAbsoluteFile());
			BufferedWriter bw = new BufferedWriter(pw);
			bw.write(content);
			bw.close();

			System.out.println("Done");

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
