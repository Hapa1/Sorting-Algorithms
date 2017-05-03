package sorter;

public class QuickSort {
	
	private Student[] list;
	private int num;
	
	public void sort(Student[] sl){
		if (sl.length <= 1){
			return; 
			}
		this.list = sl;
		num = sl.length - 1;
		qSort(0, num);
		}
	
	private void qSort(int low, int high){
		int i = low;
		int j = high;
		Student pivot = list[low + (high-low)/2]; //set the pivot number to the middle index
		
		while(i <= j){
			while(list[i].getId() < pivot.getId()){ //compare id numbers and increment i
				i++; 
			}
			while(list[j].getId() > pivot.getId()){ //compare id numbers and decrement j
				j--;
			}
			if (i <= j){ //swap the higher number with the lower one
				swap(i,j);
				i++;
				j--;
			}
		}
		
		if(low < j) qSort(low,j); //quicksort the lower half
		if(i < high) qSort(i, high); //quicksort the upper half
		
	}
	
	public void swap(int left, int right){
		Student temp = list[left];
		list[left] = list[right];
		list[right] = temp;
	}
	
	public static void main(String[] args){
		Student[] sl = new Student[4];
		Student s1 = new Student(3232, "Alex");
		Student s2 = new Student(44444, "Ryan");
		Student s3 = new Student(22,"Ben");
		Student s4 = new Student(322,"Austin");
		sl[0] = (s1);
		sl[1] = (s2);
		sl[2] = (s3);
		sl[3] = (s4);
		QuickSort s = new QuickSort();
		s.sort(sl);
		for(int i = 0; i < sl.length; i++){
			System.out.println(sl[i].toString());
			
		}
		
		
	}
	
	
}
		
		
		
	

	