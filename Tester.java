package sorter;

import java.util.concurrent.TimeUnit;
import java.util.ArrayList;
import java.io.IOException;
public class Tester {

	public static void main(String[] args) throws IOException {
		
		
		
		ReadFile r = new ReadFile();
		GenerateStudents gs = new GenerateStudents();
		
		ArrayList<String> lines = r.getArray("C:/Users/Ryan/Desktop/CS151/filename.txt");
		Student[] sl = gs.getStudents(lines);
		
			InsertionSort i = new InsertionSort();
			MergeSort m = new MergeSort();
			QuickSort q = new QuickSort();
			//Student[] InsertionSorted = i.iSort(sl); //insertionSort
			//Student[] MergeSorted = m.mSort(sl); //mergeSort
			q.sort(sl); //quickSort
			
			
			
			long total1 = 0;
			
			
			long start1 = System.nanoTime();
			m.mSort(sl);
			long end1 = System.nanoTime(); 
			long time1 = TimeUnit.MILLISECONDS.convert(end1 - start1, TimeUnit.NANOSECONDS);
			total1 = total1 + time1;
			m.mSort(sl);
			
			System.out.println("Average MergeSort Time:  " + total1 + " Nanoseconds");//mergesort
			

			long total3 = 0;
			long start3 = System.nanoTime();
			q.sort(sl);
			long end3 = System.nanoTime();
			long time3 = TimeUnit.MILLISECONDS.convert(end3 - start3, TimeUnit.NANOSECONDS);
			total3 = total3 + time3;
			q.sort(sl);
			
			System.out.println("Average QuickSort Time:  " + total3 + " Nanoseconds"); //quicksort
			
			
			long total2 = 0;
			long start2 = System.nanoTime();
			i.iSort(sl);
			long end2 = System.nanoTime();
			long time2 = TimeUnit.MILLISECONDS.convert(end2 - start2, TimeUnit.NANOSECONDS);
			total2 = total2 + time2;
			i.iSort(sl);
			
			System.out.println("Average InsertionSort Time:  " + total2 + " Nanoseconds"); //insertionsort
			
			
			
			
		}

	}


