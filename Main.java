package sorter;

import java.io.IOException;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws IOException{
		ReadFile r = new ReadFile();
		GenerateStudents gs = new GenerateStudents();
		
		ArrayList<String> lines = r.getArray("C:/Users/Ryan/Desktop/CS151/data.txt"); //Enter Directory of .txt file
		Student[] sl = gs.getStudents(lines);
		
			InsertionSort insert = new InsertionSort();
			MergeSort merge = new MergeSort();
			QuickSort quick = new QuickSort();
			insert.iSort(sl);                  //insertionSort
			//merge.mSort(sl);                 //mergeSort
			//quick.sort(sl);                  //quickSort
			
			for(int i = 0; i < sl.length; i++){
				System.out.println(sl[i].toString());
			}

	}

}
