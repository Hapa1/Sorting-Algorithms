package sorter;

import java.util.Random;

public class GenerateString {

	public String getStr(int rows){
		String s = "";
		Random randomGenerator = new Random();
		String newLine = System.getProperty("line.separator");
		for (int i = 0; i < rows; i++){
			int randomInt1 = randomGenerator.nextInt(1000);
			int randomInt2 = randomGenerator.nextInt(100);
			s = s + Integer.toString(randomInt1) + " Name" + randomInt2 + newLine;
		}
	
		return s;
	}
	
	public static void main(String[] args) {
		GenerateString g = new GenerateString();
		String s = g.getStr(5);
		System.out.println(s);
	}
	
	
}
