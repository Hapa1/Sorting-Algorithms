package sorter;

public class MergeSort {

	
	public Student[] mSort(Student[] sl){
		if (sl.length <= 1){
			return sl;
		}
		Student[] first = new Student[sl.length/2]; //split the array in half
		Student[] second = new Student[sl.length - first.length];
		System.arraycopy(sl, 0, first, 0, first.length); //copy the arrays
		System.arraycopy(sl, first.length, second, 0, second.length);
		mSort(first);
		mSort(second);
		merge(first,second,sl);
		return sl;
	}
	
	private static void merge(Student[] first, Student[] second, Student[] output){
		int firstIndex = 0;
		int secondIndex = 0;
		int i = 0;
		
		while(firstIndex < first.length && secondIndex < second.length){
			if(first[firstIndex].getId() < second[secondIndex].getId()){
				output[i] = first[firstIndex];
				firstIndex++;
			}
			else {
				output[i] = second[secondIndex];
				secondIndex++;
			}
			
			i++;
			
		}
		
		System.arraycopy(first, firstIndex, output, i, first.length - firstIndex); //copy the arrays
		System.arraycopy(second, secondIndex, output, i, second.length - secondIndex);
		
	}
	
	public static void main(String[] args){
		//ArrayList<Student> input = new ArrayList<Student>();
		Student[] sl = new Student[3];
		Student s1 = new Student(4, "Alex");
		Student s2 = new Student(3, "Ryan");
		Student s3 = new Student(4,"Ben");
		sl[0] = (s1);
		sl[1] = (s2);
		sl[2] = (s3);
		MergeSort s = new MergeSort();
		Student[] sorted = s.mSort(sl);
		for(int i = 0; i < sorted.length; i++){
			System.out.println(sorted[i].toString());
			
		}
		
		
	}
}
	
	
	

